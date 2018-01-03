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
        LogUtil.log(className + " " + method + " " + action2String(ev),response);
    }

    public static void logMethod(String className,String method,MotionEvent ev){
//        LogUtil.log(className + " " + action2String(ev),method);
    }

    public static String action2String(MotionEvent ev){
        if(MotionEvent.ACTION_DOWN == ev.getAction()){
            return "Down";
        }else if(MotionEvent.ACTION_MOVE == ev.getAction()){
            return "Move";
        }else if(MotionEvent.ACTION_UP == ev.getAction()){
            return "Up";
        }
        return "";
    }
}
