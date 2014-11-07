package com.artlite.library.compilation.ui.activities;

import android.app.ActionBar;
import android.os.Bundle;

import com.artlite.library.compilation.ui.dialogs.ProgressDialog;

/**
 * Created on 11/3/14.
 */
public abstract class BaseLibraryActivity extends BaseAsyncLayer {

    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onPause() {
        super.onPause();
        dismissProgressDialog();
    }

    /*
    UI SETTERS
     */
    public void setHeaderToUpperCase(String text) {
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setTitle(text.toUpperCase());
        }
    }

    /*
    WAITING FUNCTIONAL
     */
    public void showWaitingDialog() {
        if (progressDialog == null) {
            progressDialog = new ProgressDialog(this);
        }

        if (!progressDialog.isShowing()) {
            progressDialog.show();
        }
    }

    public void hideWaitingDialog() {
        if (progressDialog != null) {
            if (progressDialog.isShowing()) {
                progressDialog.hide();
            }
        }
    }

    private void dismissProgressDialog() {
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    protected abstract void initialize();

}
