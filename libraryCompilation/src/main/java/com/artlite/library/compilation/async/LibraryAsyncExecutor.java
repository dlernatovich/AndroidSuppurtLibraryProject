package com.artlite.library.compilation.async;

import android.os.AsyncTask;

import com.artlite.library.compilation.ui.activities.BaseAsyncLayerActivity;

/**
 * Created on 11/7/14.
 */
public class LibraryAsyncExecutor extends AsyncTask<Void, Object, Void> {

    BaseAsyncLayerActivity asyncActivity;

    public LibraryAsyncExecutor(BaseAsyncLayerActivity asyncActivity) {
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
