package com.anonymous.emojiproject;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.anonymous.emojiproject.Presenters.EmojiPresenter;
import com.anonymous.emojiproject.Views.EmojiView;

import java.util.concurrent.ExecutionException;


public class EmojiActivity extends AppCompatActivity implements EmojiView {

    private EditText editText;
    private FloatingActionButton floatingActionButton;
    private android.support.v7.widget.Toolbar toolbar;
    private EmojiPresenter emojiPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        floatingActionButton = findViewById(R.id.fab);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        emojiPresenter = new EmojiPresenter(this);

        emojiPresenter.checkFirstOpen(this);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    emojiPresenter.parseEmojiSentence(editText.getText().toString());
                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

    }

    @Override
    public void displayEmoji(final String string){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(R.string.to_emoji))
                .setMessage(string)
                .setPositiveButton(getString(android.R.string.ok), null)
                .setNegativeButton(getString(R.string.share), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        emojiPresenter.share(string);
                    }
                })
                .show();
    }

    @Override
    public void finishActivity() {
        finish();
    }

    @Override
    public void shareEmoji(String string) {
        Intent sharing = new Intent(Intent.ACTION_SEND);
        sharing.setType("text/plain");
        sharing.putExtra(Intent.EXTRA_TEXT,string);
        startActivity(Intent.createChooser(sharing, getString(R.string.share_text)));
    }
}
