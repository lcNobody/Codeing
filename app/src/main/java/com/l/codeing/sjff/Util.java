package com.l.codeing.sjff;

import android.view.MotionEvent;

import com.l.codeing.utils.LogUtil;

/**
 * Description: Util
 * Creator: Cr.L
 * Date: 2017/12/27
 */

public class Util {
    public static void logResponse(String className,String method,Boolean response){
        LogUtil.log(className + " " + method,response);
    }

    public static void logMethod(String className,String method){
        LogUtil.log(className,method);
    }

    public static void logResponse(String className,String method,Boolean response,MotionEvent ev){
//        LogUtil.log(className + " " + method + " " + ev.getAction(),response);
    }

    public static void logMethod(String className,String method,MotionEvent ev){
        LogUtil.log(className + " " + ev.getAction(),method);
    }
}
