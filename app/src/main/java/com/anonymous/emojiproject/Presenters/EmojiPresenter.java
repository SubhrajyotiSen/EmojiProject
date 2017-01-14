package com.anonymous.emojiproject.Presenters;

import android.content.Context;
import android.content.DialogInterface;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;

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
        string = string.replaceAll("[^a-zA-Z0-9\\s]", "");
        String character = string;
        String plural = string.length()==1 ? string : string.concat("s");
        String verb = string.endsWith("ing") ? string.substring(0, string.length()-3) : string;
        String singular = string;
        if (string.length() > 2 && string.charAt(string.length()-1) == 's')
            singular = string.substring(0, string.length()-1);


        for (EmojiModel emojiModel : emojiModelList ){
            for (String s : emojiModel.getKeywords())
            {
                if (s.equalsIgnoreCase(string)
                        || s.equalsIgnoreCase(plural)
                        || s.equalsIgnoreCase(singular)
                        || s.equalsIgnoreCase(verb)
                        || s.equalsIgnoreCase(string.concat("_ing"))){
                    character = emojiModel.getCharacter();
                    return character;
                }

            }
            String name = emojiModel.getName();
            if (name.equalsIgnoreCase(string)
                    || name.equalsIgnoreCase(plural)
                    || name.equalsIgnoreCase(singular)
                    || name.equalsIgnoreCase(verb)
                    || name.equalsIgnoreCase(string.concat("_ing"))) {
                character = emojiModel.getCharacter();
                return character;
            }
        }
        return character;
    }

    public void checkFirstOpen(Context context){
        if (ExtraUtils.isFirstOpen(context) && !ExtraUtils.isConnected(context)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle(R.string.network_unavailable_title);
            builder.setMessage(R.string.network_unavailabl_content);

            String positiveText = context.getString(android.R.string.ok);
            builder.setPositiveButton(positiveText,
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            emojiView.finishActivity();
                        }
                    });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else
            loadEmoji(context);
    }
}
