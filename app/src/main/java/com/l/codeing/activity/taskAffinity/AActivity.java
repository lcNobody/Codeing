package com.l.codeing.activity.taskAffinity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

/**
 * Description: AActivity
 * Creator: Cr.L
 * Date: 2018/1/3
 * A B taskAffinity 其他任务栈
 * C D taskAffinity 当前包任务栈
 *
 * 此时B->C 或B->D
 */

public class AActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("A");
        setContentView(textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(AActivity.this,BActivity.class);
                startActivity(intent);
            }
        });
    }
}
