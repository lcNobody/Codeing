package com.l.codeing.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Description: MyService
 * Creator: Cr.L
 * Date: 2018/1/2
 */

public class MyService extends Service{

    @Override
    public void onCreate() {
        super.onCreate();
    }



    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
