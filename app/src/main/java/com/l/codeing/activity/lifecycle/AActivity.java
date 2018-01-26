package com.l.codeing.activity.lifecycle;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.l.codeing.utils.LogUtil;

/**
 * Description: AActivity
 * Creator: Cr.L
 * Date: 2017/12/27
 */

public class AActivity extends BaseActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Button button = new Button(this);
//        button.setText("A");
//        setContentView(button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent();
//                intent.setClass(AActivity.this,BActivity.class);
//                startActivity(intent);
//            }
//        });
        TextView textView = new TextView(this);
        textView.setText("A");
        textView.setTextSize(150);
        setContentView(textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(AActivity.this,BActivity.class);
                startActivity(intent);
            }
        });
    }

}
