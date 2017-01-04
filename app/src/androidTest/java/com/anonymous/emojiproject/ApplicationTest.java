package com.anonymous.emojiproject;

import android.support.test.runner.AndroidJUnit4;

import com.anonymous.emojiproject.Utils.FetchData;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertNotNull;


@RunWith(AndroidJUnit4.class)
public class ApplicationTest  {

    @Test
    public void onFetchData() throws ExecutionException, InterruptedException {
        assertNotNull(new FetchData().execute().get());
    }
}