package com.anonymous.emojiproject.Utils;

import android.os.AsyncTask;
import android.util.Log;

import com.anonymous.emojiproject.Models.EmojiModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class FetchData extends AsyncTask<String, Void, List<EmojiModel>> {

    @Override
    protected List<EmojiModel> doInBackground(String... params) {
        Boolean success = false;
        ArrayList<EmojiModel> emojiModels = new ArrayList<>();

        StringBuilder data = new StringBuilder("");
        try {
            URL url = new URL("https://raw.githubusercontent.com/SubhrajyotiSen/EmojiAPI/master/emoji.json");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();

            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                data.append(line);
            }

            inputStream.close();
            //parseResult(data.toString());
            try {
                JSONArray response = new JSONArray(data.toString());
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

            success = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

       // return success;
        return emojiModels;
    }

    @Override
    protected void onPostExecute(List<EmojiModel> emojiModelList){
        super.onPostExecute(emojiModelList);
    }

}