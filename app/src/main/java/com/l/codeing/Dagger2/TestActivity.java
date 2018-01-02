package com.l.codeing.Dagger2;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import javax.inject.Inject;

/**
 * Description: TestActivity
 * Creator: Cr.L
 * Date: 2017/12/28
 */

public class TestActivity extends Activity {

    User user;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
    }

    private void initData(){
        User<XiaoDao> user = new User();
        DaggerUserComponent.create().inject(user);
        user.show();
    }
}
