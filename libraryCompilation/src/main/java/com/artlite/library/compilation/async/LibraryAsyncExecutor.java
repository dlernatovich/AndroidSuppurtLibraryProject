package com.artlite.library.compilation.async;

import android.os.AsyncTask;

import com.artlite.library.compilation.ui.activities.BaseAsyncLayer;

/**
 * Created on 11/7/14.
 */
public class LibraryAsyncExecutor extends AsyncTask<Void, Object, Void> {

    BaseAsyncLayer asyncActivity;

    public LibraryAsyncExecutor(BaseAsyncLayer asyncActivity) {
        this.asyncActivity = asyncActivity;
    }

    @Override
    protected Void doInBackground(Void... params) {
        this.asyncActivity.doInBackground();
        return null;
    }


    @Override
    protected void onPreExecute() {
        this.asyncActivity.onPreExecute();
    }


    @Override
    protected void onPostExecute(Void aVoid) {
        this.asyncActivity.onPostExecute();
    }

}
