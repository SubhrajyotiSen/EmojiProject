package com.anonymous.emojiproject.Presenters;

import android.content.Context;
import android.content.DialogInterface;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.anonymous.emojiproject.Models.EmojiModel;
import com.anonymous.emojiproject.R;
import com.anonymous.emojiproject.Utils.ExtraUtils;
import com.anonymous.emojiproject.Utils.FetchData;
import com.anonymous.emojiproject.Views.EmojiView;

import java.util.List;
import java.util.concurrent.ExecutionException;


public class EmojiPresenter {

    private EmojiView emojiView;
    private List<EmojiModel> emojiModelList;

    public EmojiPresenter(EmojiView emojiView){
        this.emojiView = emojiView;

    }

    public void loadEmoji(final Context context){
        if (ExtraUtils.isConnected(context)) {
            try {
                String json = new FetchData().execute().get();
                emojiModelList = ExtraUtils.parseJSON(json);
                PreferenceManager.getDefaultSharedPreferences(context).edit()
                        .putString("theJson",json).apply();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        else {
            if (ExtraUtils.isFirstOpen(context)){
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(R.string.network_unavailable_title);
                builder.setMessage(R.string.network_unavailabl_content);

                String positiveText = context.getString(android.R.string.ok);
                builder.setPositiveButton(positiveText,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
            else {
                String json = PreferenceManager.
                        getDefaultSharedPreferences(context).getString("theJson", "");
                emojiModelList = ExtraUtils.parseJSON(json);
            }

        }
    }

    public void parseEmojiSentence(String string){
        String[] arr = string.split(" ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = parseEmoji(arr[i]);
        emojiView.displayEmoji(TextUtils.join(" ",arr));

    }

    public String parseEmoji(String string){
        String character = string;
        for (EmojiModel emojiModel : emojiModelList ){
            for (String s : emojiModel.getKeywords())
            {
                if (s.equalsIgnoreCase(string))
                    character = emojiModel.getCharacter();
            }
            if (emojiModel.getName().equalsIgnoreCase(character))
                character = emojiModel.getCharacter();
        }
        return character;
    }

    public void hideKeyboard(View view, Context context){
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
