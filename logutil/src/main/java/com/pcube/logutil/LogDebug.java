package com.pcube.logutil;

import android.util.Log;

/**
 * Created by pcube105 on 5/17/2017.
 */

public class LogDebug {

    public static final String TAG = "SUPER_AWSOME_APP";

    public static void d(String message){
        Log.d(TAG, message);
    }
}
