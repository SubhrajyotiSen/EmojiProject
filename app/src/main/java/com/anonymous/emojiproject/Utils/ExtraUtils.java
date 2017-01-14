package com.anonymous.emojiproject.Utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.anonymous.emojiproject.Models.EmojiModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class ExtraUtils {

    public static boolean isConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if (activeNetwork != null) {
            if (activeNetwork.getType() == ConnectivityManager.TYPE_WIFI || activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE)
                return true;
        }
        return false;
    }

    public static ArrayList<EmojiModel> parseJSON(String data){
        ArrayList<EmojiModel> emojiModels = new ArrayList<>();
        try {
            JSONArray response = new JSONArray(data);
            for (int i = 0 ; i < response.length() ; i++) {
                JSONObject jsonObject = response.getJSONObject(i);
                EmojiModel emojiModel = new EmojiModel();
                emojiModel.setName(jsonObject.getString("name"));
                emojiModel.setCategory(jsonObject.getString("category"));
                emojiModel.setCharacter(jsonObject.getString("char"));
                JSONArray keywords = jsonObject.getJSONArray("keywords");
                ArrayList<String> arrayList = new ArrayList<>();
                for (int j = 0; j < keywords.length() ; j++ ) {
                    arrayList.add(keywords.getString(j));
                }
                emojiModel.setKeywords(arrayList);
                emojiModels.add(emojiModel);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return emojiModels;
    }
}
