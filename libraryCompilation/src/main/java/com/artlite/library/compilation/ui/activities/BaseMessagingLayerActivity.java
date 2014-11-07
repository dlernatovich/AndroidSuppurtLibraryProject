package com.artlite.library.compilation.ui.activities;

import android.support.v4.app.FragmentActivity;

import com.artlite.library.compilation.constants.BaseFunction;
import com.thirdparty.snackbar.SnackBar;

import com.thirdparty.messagebar.MessageBar;

/**
 * Created on 11/7/14.
 */
public abstract class BaseMessagingLayerActivity extends FragmentActivity implements BaseFunction {

    private SnackBar snackBar;
    private MessageBar messageBar;

    /*
    MESSAGING FUNCTIONAL
     */
    public void showMessage(String message) {
        createSnackBar();
        snackBar.show(message, SnackBar.MED_SNACK);
    }

    public void showMessageWithAction(String message, String actionMessage, SnackBar.OnMessageClickListener onClickListener) {
        createSnackBar();
        snackBar.setOnClickListener(onClickListener);
        snackBar.show(message, actionMessage, SnackBar.Style.CONFIRM, SnackBar.MED_SNACK);
    }

    public void showToast(String message) {
        createMessageBar();
        messageBar.show(message);
    }

    public void showToastWithAction(String message, String buttonMessage, MessageBar.OnMessageClickListener onClickListener) {
        createMessageBar();
        messageBar.show(message, buttonMessage);
        messageBar.setOnClickListener(onClickListener);
    }

    private void createSnackBar() {
        if (snackBar == null) {
            snackBar = new SnackBar(this);
        }
    }

    private void createMessageBar() {
        if (messageBar == null) {
            messageBar = new MessageBar(this);
        }
    }


}
