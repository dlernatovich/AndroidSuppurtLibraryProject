package com.artlite.library.compilation.ui.fragments;

import android.app.Activity;
import android.support.v4.app.Fragment;

import com.artlite.library.compilation.ui.BaseFunction;
import com.artlite.library.compilation.ui.activities.BaseLibraryActivity;
import com.github.mrengineer13.snackbar.SnackBar;

import net.simonvt.messagebar.MessageBar;

/**
 * Created on 11/3/14.
 */
public class BaseLibraryFragment extends Fragment implements BaseFunction {
    protected BaseLibraryActivity getBaseActivity() {
        Activity activity = getActivity();
        if (activity instanceof BaseLibraryActivity) {
            return (BaseLibraryActivity) activity;
        }
        return null;
    }

    public void showMessage(String message) {
        BaseLibraryActivity activity = getBaseActivity();
        if (activity != null) {
            activity.showMessage(message);
        }
    }

    public void showMessageWithAction(String message, String actionMessage, SnackBar.OnMessageClickListener onMessageClickListener) {
        BaseLibraryActivity activity = getBaseActivity();
        if (activity != null) {
            activity.showMessageWithAction(message, actionMessage, onMessageClickListener);
        }
    }

    public void showToast(String message) {
        BaseLibraryActivity activity = getBaseActivity();
        if (activity != null) {
            activity.showToast(message);
        }
    }

    public void showToastWithAction(String message, String buttonMessage, MessageBar.OnMessageClickListener onClickListener) {
        BaseLibraryActivity activity = getBaseActivity();
        if (activity != null) {
            activity.showToastWithAction(message, buttonMessage, onClickListener);
        }
    }
}
