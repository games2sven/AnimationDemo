package com.xys.animationartdemo.demo6;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.xys.animationartdemo.R;

public class Demo6Activity extends ActionBarActivity {

    Demo6View dotsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo6);
        dotsTextView = (Demo6View) findViewById(R.id.dots);
        dotsTextView.start();
    }
}
