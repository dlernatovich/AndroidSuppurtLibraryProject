package com.artlite.library.compilation.ui.activities;

import android.support.v4.app.FragmentTransaction;

import com.artlite.library.compilation.ui.fragments.BaseLibraryFragment;

/**
 * Created on 11/7/14.
 */
public abstract class BaseFragmentLayer extends BaseMessagingLayer {

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


}
