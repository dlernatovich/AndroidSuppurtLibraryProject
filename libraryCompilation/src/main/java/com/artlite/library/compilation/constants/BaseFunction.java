package com.artlite.library.compilation.constants;

import com.thirdparty.snackbar.SnackBar;

import com.thirdparty.messagebar.MessageBar;

/**
 * Created on 11/3/14.
 */
public interface BaseFunction {
    public void showMessage(String message);

    public void showMessageWithAction(String message, String actionMessage, SnackBar.OnMessageClickListener onMessageClickListener);

    public void showToast(String message);

    public void showToastWithAction(String message, String buttonMessage, MessageBar.OnMessageClickListener onClickListener);

    public void showWaitingDialog();

    public void hideWaitingDialog();
}
