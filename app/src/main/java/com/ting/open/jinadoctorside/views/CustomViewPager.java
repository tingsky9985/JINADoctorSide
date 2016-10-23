package com.ting.open.jinadoctorside.views;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by lt on 2016/10/23.
 */
public class CustomViewPager extends ViewPager {
    private boolean isScroller;

    public CustomViewPager(Context context) {
        this(context, null);
    }

    public CustomViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (!isScroller) {
            return false;
        } else {
            return super.onTouchEvent(event);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if(!isScroller) {
            return false;
        } else {
            return super.onInterceptTouchEvent(ev);
        }
    }

    public void setOnScroller(boolean isScroller) {
        this.isScroller = isScroller;
    }

    public boolean isOnScroller() {
        return isScroller;
    }
}
