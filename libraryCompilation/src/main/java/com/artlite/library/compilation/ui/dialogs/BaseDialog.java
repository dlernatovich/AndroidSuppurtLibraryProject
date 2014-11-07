package com.artlite.library.compilation.ui.dialogs;

import android.app.Dialog;
import android.content.Context;

/**
 * Created on 11/7/14.
 */
public class BaseDialog extends Dialog {

    public BaseDialog(Context context) {
        super(context);
    }

    public BaseDialog(Context context, int theme) {
        super(context, theme);
    }

    public BaseDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }
}
