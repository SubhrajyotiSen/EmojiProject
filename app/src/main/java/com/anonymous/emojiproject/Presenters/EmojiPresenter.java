package com.anonymous.emojiproject.Presenters;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.anonymous.emojiproject.Models.EmojiModel;
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
            String json = PreferenceManager.
                    getDefaultSharedPreferences(context).getString("theJson", "");
            emojiModelList = ExtraUtils.parseJSON(json);
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

    public void checkInternet(Context context){
        if (ExtraUtils.isConnected(context))
            loadEmoji(context);
        else
            ExtraUtils.showInternetDialog(context);
    }
}
