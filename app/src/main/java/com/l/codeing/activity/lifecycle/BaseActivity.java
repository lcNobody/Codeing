package com.l.codeing.activity.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import com.l.codeing.utils.LogUtil;

/**
 * Description: BaseActivity
 * Creator: Cr.L
 * Date: 2017/12/27
 */

public class BaseActivity extends Activity {
//    public static String log = "base";

    public String getLog(){
        return "base";
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        log = getLog();
        super.onCreate(savedInstanceState);
        LogUtil.log(getLog(),"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        LogUtil.log(getLog(),"onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        LogUtil.log(getLog(),"onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogUtil.log(getLog(),"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogUtil.log(getLog(),"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        LogUtil.log(getLog(),"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogUtil.log(getLog(),"onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        LogUtil.log(getLog(),"onSaveInstanceState");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        LogUtil.log(getLog(),"onSaveInstanceState2");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        LogUtil.log(getLog(),"onRestoreInstanceState");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
        LogUtil.log(getLog(),"onRestoreInstanceState2");
    }
}
