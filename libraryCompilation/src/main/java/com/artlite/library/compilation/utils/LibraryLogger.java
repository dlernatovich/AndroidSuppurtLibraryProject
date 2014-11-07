package com.artlite.library.compilation.utils;


import android.util.Log;

/**
 * Created on 11/7/14.
 */
public class LibraryLogger {
    private static final String LOG_DIFFERENCE = "========>";

    public static void debug(String text) {
        Log.d(LOG_DIFFERENCE, text);
    }

    public static void error(String text) {
        Log.e(LOG_DIFFERENCE, text);
    }

    public static void info(String text) {
        Log.i(LOG_DIFFERENCE, text);
    }
}
