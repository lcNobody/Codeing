package com.l.codeing.activity.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

/**
 * Description: AActivity
 * Creator: Cr.L
 * Date: 2017/12/27
 */

public class AActivity extends BaseActivity{
    public String log = "A";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("A");
        setContentView(textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建构建器
//                AlertDialog.Builder builder = new AlertDialog.Builder(AActivity.this);
//                // 设置参数
//                builder.setTitle("请做出选择");
//                builder.create().show();
                Intent intent = new Intent();
                intent.setClass(AActivity.this,BActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public String getLog() {
        return log;
    }
}
