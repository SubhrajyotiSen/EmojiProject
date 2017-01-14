package com.anonymous.emojiproject.Utils;

import android.os.AsyncTask;

import com.anonymous.emojiproject.Models.EmojiModel;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


public class FetchData extends AsyncTask<String, Void, String> {

    @Override
    protected String doInBackground(String... params) {
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

        } catch (Exception e) {
            e.printStackTrace();
        }
        return data.toString();
    }

    @Override
    protected void onPostExecute(String data){
        super.onPostExecute(data);
    }

}