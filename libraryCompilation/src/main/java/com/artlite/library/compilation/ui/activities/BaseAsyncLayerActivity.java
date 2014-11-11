package com.artlite.library.compilation.ui.activities;

import com.artlite.library.compilation.async.LibraryAsyncExecutor;
import com.artlite.library.compilation.utils.LibraryLogger;

/**
 * Created on 11/7/14.
 */
public abstract class BaseAsyncLayerActivity extends BaseFragmentLayerActivity {

    protected final void startAsyncTask() {
        new LibraryAsyncExecutor(this).execute();
    }

    public void onPreExecute() {
        LibraryLogger.error("OnPreexecuteStarted");
    }

    public void doInBackground() {
        LibraryLogger.error("doInBackgroundStarted");
    }

    public void onPostExecute() {
        LibraryLogger.error("OnPostExecuteFinished");
    }

}
