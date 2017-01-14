package com.anonymous.emojiproject;

import android.support.test.runner.AndroidJUnit4;

import com.anonymous.emojiproject.Presenters.EmojiPresenter;
import com.anonymous.emojiproject.Utils.FetchData;
import com.anonymous.emojiproject.Views.EmojiActivity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


@RunWith(AndroidJUnit4.class)
public class ApplicationTest  {

    @Mock
    EmojiActivity activity;

    @Test
    public void onFetchData() throws ExecutionException, InterruptedException {
        assertNotNull(new FetchData().execute().get());
    }

    @Test
    public void translateWord(){
        EmojiPresenter emojiPresenter = new EmojiPresenter(activity);
        emojiPresenter.loadEmoji();
        assertEquals(emojiPresenter.parseEmoji("pizza"),"\uD83C\uDF55");
    }
}