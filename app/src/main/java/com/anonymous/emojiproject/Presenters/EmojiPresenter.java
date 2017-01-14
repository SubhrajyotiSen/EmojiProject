package com.anonymous.emojiproject.Presenters;

import android.text.TextUtils;

import com.anonymous.emojiproject.Models.EmojiModel;
import com.anonymous.emojiproject.Utils.FetchData;
import com.anonymous.emojiproject.Views.EmojiActivity;

import java.util.List;
import java.util.concurrent.ExecutionException;


public class EmojiPresenter {

    private EmojiActivity emojiActivity;
    private List<EmojiModel> emojiModelList;

    public EmojiPresenter(EmojiActivity emojiActivity){
        this.emojiActivity = emojiActivity;

    }

    public void loadEmoji(){

        try {
            emojiModelList = new FetchData().execute().get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    public void parseEmojiSentence(String string){
        String[] arr = string.split(" ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = parseEmoji(arr[i]);
        emojiActivity.displayEmoji(TextUtils.join(" ",arr));

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
}
