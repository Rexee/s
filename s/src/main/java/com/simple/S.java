package com.simple;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class S {
    public static final String TAG = "DBG";

    public static void L(Context c, Object o) {
        String txt = o.toString();
        Toast.makeText(c, txt, Toast.LENGTH_LONG).show();
        Log.d(TAG, txt);
    }

    public static void L(String s, Object... args) {
        Log.d(TAG, String.format(s, args));
    }

    public static void L(Object o) {
        if (o == null) {
            Log.d(TAG, "null");
        } else {
            Log.d(TAG, o.toString());
        }
    }

    public static void L(Throwable t) {
        Log.d(TAG, "Throw: " + t.getMessage());
    }

    public static void L(Throwable t, String s, Object... args) {
        Log.d(TAG, "Throw: " + t.getMessage() + ". " + String.format(s, args));
    }

    public static void E(Context context, Throwable error) {
        Toast.makeText(context, "Error: " + error.getMessage(), Toast.LENGTH_LONG).show();
        S.L(error.getMessage());
    }
}
