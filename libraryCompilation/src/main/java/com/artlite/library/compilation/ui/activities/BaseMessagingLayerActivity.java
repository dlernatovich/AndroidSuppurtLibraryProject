package com.artlite.library.compilation.ui.activities;

import android.os.Parcelable;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.artlite.library.compilation.constants.BaseFunction;
import com.thirdparty.messagebar.MessageBar;
import com.thirdparty.snackbar.SnackBar;

/**
 * Created on 11/7/14.
 */
public abstract class BaseMessagingLayerActivity extends FragmentActivity implements BaseFunction, View.OnClickListener {

    private SnackBar snackBar;
    private MessageBar messageBar;

    /*
    MESSAGING FUNCTIONAL
     */
    public void showErrorMessage(String message) {
        createSnackBar();
        snackBar.setOnClickListener(new SnackBar.OnMessageClickListener() {
            @Override
            public void onMessageClick(Parcelable token) {
            }
        });
        snackBar.show(message, "OK", SnackBar.Style.ALERT, SnackBar.MED_SNACK);

    }

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
