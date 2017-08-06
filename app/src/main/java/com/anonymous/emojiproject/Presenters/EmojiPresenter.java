package com.anonymous.emojiproject.Presenters;

import android.content.Context;
import android.content.DialogInterface;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;

import com.anonymous.emojiproject.Models.AsyncContainer;
import com.anonymous.emojiproject.Models.EmojiModel;
import com.anonymous.emojiproject.R;
import com.anonymous.emojiproject.Utils.ExtraUtils;
import com.anonymous.emojiproject.Utils.FetchData;
import com.anonymous.emojiproject.Utils.TranslateTask;
import com.anonymous.emojiproject.Views.EmojiView;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;


public class EmojiPresenter {

    private EmojiView emojiView;
    private List<EmojiModel> emojiModelList;
    private TranslateTask translateTask;

    public EmojiPresenter(EmojiView emojiView){
        this.emojiView = emojiView;

    }

    public void loadEmoji(final Context context){
        if (ExtraUtils.isConnected(context)) {
            try {
                String json = new FetchData().execute().get();
                emojiModelList = ExtraUtils.parseJSON(json);
                PreferenceManager.getDefaultSharedPreferences(context).edit()
                        .putString("theJson",json).apply();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        else {
            String json = PreferenceManager.
                    getDefaultSharedPreferences(context).getString("theJson", "");
            emojiModelList = ExtraUtils.parseJSON(json);
        }
    }

    public void parseEmojiSentence(String string) throws ExecutionException, InterruptedException {
        translateTask = new TranslateTask();
        emojiView.displayEmoji(translateTask.execute(new AsyncContainer(string,(ArrayList) emojiModelList)).get());
    }


    public void checkFirstOpen(Context context){
        if (ExtraUtils.isFirstOpen(context) && !ExtraUtils.isConnected(context)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle(R.string.network_unavailable_title);
            builder.setMessage(R.string.network_unavailabl_content);

            String positiveText = context.getString(android.R.string.ok);
            builder.setPositiveButton(positiveText,
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            emojiView.finishActivity();
                        }
                    });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else
            loadEmoji(context);
    }

    public ArrayList<EmojiModel> getEmojiList(){
        return (ArrayList<EmojiModel>) emojiModelList;
    }

    public void share(String string) {
        emojiView.shareEmoji(string);
    }
}
