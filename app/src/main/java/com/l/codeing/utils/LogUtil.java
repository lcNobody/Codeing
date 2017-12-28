package com.l.codeing.utils;

import android.util.Log;

/**
 * Description: LogUtil
 * Creator: Cr.L
 * Date: 2017/12/27
 */

public class LogUtil {
    public static void log(String content){
        Log.d("---------------",content);
    }
    public static void log(String name,String content){
        Log.d(name,content);
    }
    public static void log(String name,Boolean content){
        Log.d(name,Boolean.toString(content));
    }
}
