package com.l.codeing.activity;

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
    public static String log = "base";

    public String getLog(){
        return "base";
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        log = getLog();
        super.onCreate(savedInstanceState);
        LogUtil.log(log,"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        LogUtil.log(log,"onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        LogUtil.log(log,"onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogUtil.log(log,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogUtil.log(log,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        LogUtil.log(log,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogUtil.log(log,"onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        LogUtil.log(log,"onSaveInstanceState");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        LogUtil.log(log,"onSaveInstanceState2");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        LogUtil.log(log,"onRestoreInstanceState");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
        LogUtil.log(log,"onRestoreInstanceState2");
    }
}
