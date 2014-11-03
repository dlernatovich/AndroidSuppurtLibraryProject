package com.artlite.library.compilation.ui.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

import com.artlite.library.compilation.ui.BaseFunction;
import com.artlite.library.compilation.ui.fragments.BaseLibraryFragment;
import com.github.mrengineer13.snackbar.SnackBar;

import net.simonvt.messagebar.MessageBar;

/**
 * Created on 11/3/14.
 */
public class BaseLibraryActivity extends FragmentActivity implements BaseFunction {

    private SnackBar snackBar;
    private MessageBar messageBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /*
    FRAGMENT FUNCTIONAL
     */

    public void add(BaseLibraryFragment fragment, int container_id) {
        getFragmentTransaction().add(container_id, fragment)
                .commit();
    }

    public void replace(BaseLibraryFragment fragment, int container_id) {
        getFragmentTransaction().replace(container_id, fragment).commit();
    }

    private FragmentTransaction getFragmentTransaction() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        return ft;
    }

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
//        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
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
