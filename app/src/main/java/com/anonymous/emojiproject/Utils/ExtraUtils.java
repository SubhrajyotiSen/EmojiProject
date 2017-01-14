package com.anonymous.emojiproject.Utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.util.Log;

import com.anonymous.emojiproject.Models.EmojiModel;
import com.anonymous.emojiproject.R;

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

    public static boolean isFirstOpen(Context context){
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(context);
        if (settings.getBoolean(context.getString(R.string.first_sp), true)) {
            settings.edit().putBoolean(context.getString(R.string.first_sp), false).apply();
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

    public static void showInternetDialog(Context context){
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
}
