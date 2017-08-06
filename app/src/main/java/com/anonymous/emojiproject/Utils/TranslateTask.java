package com.anonymous.emojiproject.Utils;

import android.os.AsyncTask;
import android.text.TextUtils;

import com.anonymous.emojiproject.Models.AsyncContainer;
import com.anonymous.emojiproject.Models.EmojiModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TranslateTask extends AsyncTask<AsyncContainer, Void, String> {

    private ArrayList<EmojiModel> emojiModelList;
    @Override
    protected String doInBackground(AsyncContainer... asyncContainers) {
        emojiModelList = asyncContainers[0].getEmojiModelArrayList();
        String string = asyncContainers[0].getString();
        string = string.replaceAll("[^a-zA-Z0-9\\s_?]", "");
        String[] arr = string.split(" ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = parseEmoji(arr[i]);
        return (TextUtils.join(" ",arr));
    }

    private String parseEmoji(String string){
        List<String> list = new ArrayList<>(Arrays.asList("us","to","so","no","in","be","it","is"));
        if (list.contains(string))
            return string;

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

}
