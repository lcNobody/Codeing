package com.l.codeing.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.l.codeing.utils.LogUtil;

/**
 * Description: BActivity
 * Creator: Cr.L
 * Date: 2017/12/27
 */

public class BActivity extends BaseActivity{
    public String log = "B";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("B");
        setContentView(textView);
    }

    @Override
    public String getLog() {
        return log;
    }
}
