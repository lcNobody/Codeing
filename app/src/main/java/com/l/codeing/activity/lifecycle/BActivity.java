package com.l.codeing.activity.lifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Description: BActivity
 * Creator: Cr.L
 * Date: 2017/12/27
 */

public class BActivity extends BaseActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Button button = new Button(this);
//        button.setText("B");
//        setContentView(button);
        TextView textView = new TextView(this);
        textView.setText("B");
        textView.setTextSize(150);
        setContentView(textView);
    }

}
