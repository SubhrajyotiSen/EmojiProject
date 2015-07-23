package com.anonymous.emojiproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    //final static String IMAGES_API_ENDPOINT = "https://raw.githubusercontent.com/SubhrajyotiSen/emojilib/master/emojis.json";
    //FetchList helper = FetchList.getInstance();
    EditText editText;
    EditText textView;
    Button button;
    Button button2;
    String s;

    String Word;
    EmojiList list = new EmojiList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        textView = (EditText) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        list.main();


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(" ");
                s = editText.getText().toString();
                String words[] = s.split("\\s+");
                for (int i = 0; i < words.length; i++) {
                    // You may want to check for a non-word character before blindly
                    // performing a replacement
                    // It may also be necessary to adjust the character class
                    words[i] = words[i].replaceAll("[^\\w]", "");
                }
                searchRandomImage();

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                share();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            new MaterialDialog.Builder(this)
                    .title("Emojify")
                    .content("Developed by Subhrajyoti Sen\nPowered by emojilib")
                    .positiveText("OK")
                    .show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //private void searchRandomImage(/*final String words[]*/) {

        /*textView.setText(" ");
        s = editText.getText().toString();
        String words[] = s.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            // You may want to check for a non-word character before blindly
            // performing a replacement
            // It may also be necessary to adjust the character class
            words[i] = words[i].replaceAll("[^\\w]", "");
        }

        final String[] wordsx = words.clone();




        JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, IMAGES_API_ENDPOINT, null, new Response.Listener<JSONArray>() {

            @Override
            public void onResponse(JSONArray response) {
                String words2 = "";
                try {
                    for (String word : wordsx) {
                        for (int i = 0; i < response.length(); i++) {

                            JSONObject person = (JSONObject) response.get(i);
                            Word = word;
                            String et = word.toLowerCase().trim();
                            if (et.equals(person.getString("name"))) {
                                Word = person.getString("char");
                                break;
                            }

                        }
                        words2 += Word + " ";

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                textView.setText(words2);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        helper.add(request);
    }*/

    private void share(){

        Intent sharing = new Intent(Intent.ACTION_SEND);
        sharing.setType("text/plain");
        sharing.putExtra(Intent.EXTRA_TEXT,textView.getText().toString());
        startActivity(Intent.createChooser(sharing, "Share via"));

    }

    private void searchRandomImage(){

        int x;
        textView.setText(" ");
        s = editText.getText().toString();
        String words[] = s.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            // You may want to check for a non-word character before blindly
            // performing a replacement
            // It may also be necessary to adjust the character class
            words[i] = words[i].replaceAll("[^\\w]", "");
        }

        final String[] wordsx = words.clone();

        String words2 = "";
        try {
            for (String word : wordsx) {
                for (int i = 0; i < list.jsonArray.length(); i++) {

                    x=0;
                    JSONObject person = (JSONObject) list.jsonArray.get(i);
                    Word = word;
                    String et = word.toLowerCase().trim();
                    if (et.equals(person.getString("name"))) {
                        Word = person.getString("char");
                        break;
                    }
                    String mo = person.optString("keywords");
                    mo = mo.replaceAll("[^a-zA-Z0-9\\s]", " ");
                    String[] words21 = mo.split("\\s+");


                    for (String aWords21 : words21) {
                        if(et.equals(aWords21.trim())){
                            Word = person.getString("char");
                            x++;
                            break;
                        }

                    }
                    if(x==1)
                        break;



                }
                words2 += Word + " ";

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        textView.setText(words2);
    }
}
