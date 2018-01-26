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

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogUtil.log(getClass().getSimpleName(),"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        LogUtil.log(getClass().getSimpleName(),"onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        LogUtil.log(getClass().getSimpleName(),"onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogUtil.log(getClass().getSimpleName(),"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogUtil.log(getClass().getSimpleName(),"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        LogUtil.log(getClass().getSimpleName(),"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogUtil.log(getClass().getSimpleName(),"onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        LogUtil.log(getClass().getSimpleName(),"onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        LogUtil.log(getClass().getSimpleName(),"onRestoreInstanceState");
    }
}
