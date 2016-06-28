package com.anonymous.emojiproject.Models;


import java.util.ArrayList;

import io.realm.RealmObject;

public class EmojiModel extends RealmObject{

    private String name;
    private ArrayList<String> keywords;
    private String character;
    private String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(ArrayList<String> keywords) {
        this.keywords = keywords;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public EmojiModel(){
        keywords = new ArrayList<>();
    }
}
