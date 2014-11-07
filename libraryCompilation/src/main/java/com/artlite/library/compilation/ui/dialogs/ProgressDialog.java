package com.artlite.library.compilation.ui.dialogs;

import android.content.Context;

import com.artlite.library.compilation.R;

/**
 * Created on 11/7/14.
 */
public class ProgressDialog extends BaseDialog {
    public ProgressDialog(Context context) {
        super(context, R.style.Theme_Black_NoTitleBar_Fullscreen);
        setContentView(R.layout.mb_dialog_view);
    }

}
