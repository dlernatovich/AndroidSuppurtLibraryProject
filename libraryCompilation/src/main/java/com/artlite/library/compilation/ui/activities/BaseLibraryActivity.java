package com.artlite.library.compilation.ui.activities;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.artlite.library.compilation.ui.dialogs.ProgressDialog;

import butterknife.ButterKnife;

/**
 * Created on 11/3/14.
 */
public abstract class BaseLibraryActivity extends BaseAsyncLayerActivity {

    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void onCreate(Bundle savedInstanceState, int layoutID) {
        super.onCreate(savedInstanceState);
        setContentView(layoutID);
        inject();
    }

    protected void onCreate(Bundle savedInstanceState, int layoutID, int[] buttonIDs) {
        super.onCreate(savedInstanceState);
        setContentView(layoutID);
        setUpButtonsListener(buttonIDs);
        inject();
    }

    @Override
    protected void onPause() {
        super.onPause();
        dismissProgressDialog();
    }

    public void startActivity(Class aClass) {
        startActivity(new Intent(this, aClass));
    }

    public void setUpButtonsListener(int[] idsArray) {
        for (int i = 0; i < idsArray.length; i++) {
            ((Button) findViewById(idsArray[i])).setOnClickListener(this);
        }
    }

    protected void inject() {
        ButterKnife.inject(this);
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

    protected void initialize() {

    }

    @Override
    public void onClick(View v) {

    }

    protected String getText(EditText editText) {
        return editText.getText().toString().trim();
    }

    protected void closeActivity() {
        this.finish();
    }
}
