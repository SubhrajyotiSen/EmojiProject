package com.anonymous.emojiproject;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.anonymous.emojiproject.Models.AsyncContainer;
import com.anonymous.emojiproject.Presenters.EmojiPresenter;
import com.anonymous.emojiproject.Utils.ExtraUtils;
import com.anonymous.emojiproject.Utils.FetchData;
import com.anonymous.emojiproject.Utils.TranslateTask;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
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
    public void translateWord() throws ExecutionException, InterruptedException {
        EmojiPresenter emojiPresenter = new EmojiPresenter(activity);
        emojiPresenter.loadEmoji(InstrumentationRegistry.getContext());
        if (ExtraUtils.isConnected(InstrumentationRegistry.getContext()))
            assertEquals((new TranslateTask().execute(new AsyncContainer("pizza",emojiPresenter.getEmojiList())).get()), "\uD83C\uDF55");
        else
            assertEquals((new TranslateTask().execute(new AsyncContainer("pizza",emojiPresenter.getEmojiList())).get()), "pizza");
        assertNotEquals((new TranslateTask().execute(new AsyncContainer("pizza",emojiPresenter.getEmojiList())).get()), "\uD83C\uDF69");


    }
}