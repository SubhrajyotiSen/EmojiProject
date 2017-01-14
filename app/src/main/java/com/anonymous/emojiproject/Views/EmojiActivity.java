package com.anonymous.emojiproject.Views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import com.anonymous.emojiproject.Presenters.EmojiPresenter;
import com.anonymous.emojiproject.R;


public class EmojiActivity extends AppCompatActivity implements EmojiView {

    EditText editText;
    EditText textView;
    EmojiPresenter emojiPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        textView = (EditText) findViewById(R.id.textView);
        emojiPresenter = new EmojiPresenter(this);

        emojiPresenter.checkInternet(this);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                    emojiPresenter.parseEmojiSentence(editable.toString());
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

        switch (id){
            case R.id.action_share:
                Intent sharing = new Intent(Intent.ACTION_SEND);
                sharing.setType("text/plain");
                sharing.putExtra(Intent.EXTRA_TEXT,textView.getText().toString());
                startActivity(Intent.createChooser(sharing, getString(R.string.share_text)));
                break;
            case R.id.action_about:
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void displayEmoji(String string){
        textView.setText(string);
    }

}
