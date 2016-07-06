package com.anarchy.qqpresentation.presentation;

import android.animation.Animator;
import android.graphics.Point;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/**
 * Version 2.1.1
 * <p/>
 * Date: 16/7/1 15:49
 * Author: zhendong.wu@shoufuyou.com
 * <p/>
 * Copyright © 2014-2016 Shanghai Xiaotu Network Technology Co., Ltd.
 */
public interface Portrait {
    Animator showHalo();
    Animator hideHalo();
    Animator want();
    int getLeft();
    int getTop();
    int getWidth();
    int getHeight();
    float getX();
    float getY();
    ViewGroup.LayoutParams getLayoutParams();
}
