package com.anonymous.emojiproject.Models;

import java.util.ArrayList;


public class AsyncContainer {
    private String string;
    private ArrayList<EmojiModel> emojiModelArrayList;

    public AsyncContainer(String string, ArrayList<EmojiModel> emojiModelArrayList){
        this.string = string;
        this.emojiModelArrayList = emojiModelArrayList;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public ArrayList<EmojiModel> getEmojiModelArrayList() {
        return emojiModelArrayList;
    }

    public void setEmojiModelArrayList(ArrayList<EmojiModel> emojiModelArrayList) {
        this.emojiModelArrayList = emojiModelArrayList;
    }
}
