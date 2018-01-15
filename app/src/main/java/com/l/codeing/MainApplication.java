package com.l.codeing;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Description: MainApplication
 * Creator: Cr.L
 * Date: 2018/1/12
 */

public class MainApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this) ;
    }
}
