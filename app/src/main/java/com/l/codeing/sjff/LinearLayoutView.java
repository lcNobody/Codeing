package com.l.codeing.sjff;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import com.l.codeing.utils.LogUtil;

/**
 * Description: LinearLayoutView
 * Creator: Cr.L
 * Date: 2017/12/27
 */

public class LinearLayoutView extends LinearLayout {
    public String log = "LinearLayoutView";

    public LinearLayoutView(Context context) {
        super(context);
    }

    public LinearLayoutView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public LinearLayoutView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Util.logMethod(log,"onInterceptTouchEvent",ev);
        boolean re = super.onInterceptTouchEvent(ev);
        Util.logResponse(log,"onInterceptTouchEvent",re,ev);
        return re;
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
