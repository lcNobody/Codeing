package com.l.codeing.sjff;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;

import com.l.codeing.utils.LogUtil;

/**
 * Description: ButtonView
 * Creator: Cr.L
 * Date: 2017/12/27
 */

public class ButtonView2 extends Button {

    public String log = "ButtonView2";
    public ButtonView2(Context context) {
        super(context);
    }

    public ButtonView2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ButtonView2(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ButtonView2(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Util.logMethod(log,"dispatchTouchEvent",ev);
        boolean re = super.dispatchTouchEvent(ev);
        Util.logResponse(log,"dispatchTouchEvent",re,ev);
        return re;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        Util.logMethod(log,"onTouchEvent",ev);
        boolean re = super.onTouchEvent(ev);
        Util.logResponse(log,"onTouchEvent",re,ev);
        return re;
    }
}
