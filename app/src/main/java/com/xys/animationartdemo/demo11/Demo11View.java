package com.xys.animationartdemo.demo11;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

import com.xys.animationartdemo.R;

import java.util.Iterator;

/**
 * Created by Administrator on 2017/11/28 0028.
 */

public class Demo11View extends View{

    Interpolator interpolator = new LinearInterpolator();//线性插值器
    private Interpolator[] interpolators;



    public Demo11View(Context context) {
        super(context);
    }

    public Demo11View(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Demo11View(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);


    }

    private void init(){
        ImageView imageView = new ImageView(getContext());
        Drawable red = getResources().getDrawable(R.drawable.pl_red);
    }


}
