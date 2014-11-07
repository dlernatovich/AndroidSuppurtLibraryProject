package com.artlite.library.compilation.ui.activities;

import com.artlite.library.compilation.async.LibraryAsyncExecutor;
import com.artlite.library.compilation.utils.LibraryLogger;

/**
 * Created on 11/7/14.
 */
public abstract class BaseAsyncLayer extends BaseFragmentLayer {

    private LibraryAsyncExecutor baseAsyncTask = new LibraryAsyncExecutor(this);

    protected final void startAsyncTask() {
        baseAsyncTask.execute();
    }

    public void onPreExecute() {
        LibraryLogger.error("OnPreexecuteStarted");
    }

    public void doInBackground() {

    }

    public void onPostExecute() {
        LibraryLogger.error("OnPostExecuteFinished");
    }

}
