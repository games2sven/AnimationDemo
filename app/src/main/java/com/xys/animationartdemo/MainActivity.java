package com.xys.animationartdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.xys.animationartdemo.demo1.Demo1Activity;
import com.xys.animationartdemo.demo10.Demo10Activity;
import com.xys.animationartdemo.demo2.Demo2Activity;
import com.xys.animationartdemo.demo3.Demo3Activity;
import com.xys.animationartdemo.demo4.Demo4Activity;
import com.xys.animationartdemo.demo5.Demo5Activity;
import com.xys.animationartdemo.demo6.Demo6Activity;
import com.xys.animationartdemo.demo7.Demo7Activity;
import com.xys.animationartdemo.demo8.Demo8Activity;
import com.xys.animationartdemo.demo9.Demo9Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void demo1(View view) {
        startActivity(new Intent(this, Demo1Activity.class));
    }

    public void demo2(View view) {
        startActivity(new Intent(this, Demo2Activity.class));
    }

    public void demo3(View view) {
        startActivity(new Intent(this, Demo3Activity.class));
    }

    public void demo4(View view) {
        startActivity(new Intent(this, Demo4Activity.class));
    }

    public void demo5(View view) {
        startActivity(new Intent(this, Demo5Activity.class));
    }

    public void demo6(View view) {
        startActivity(new Intent(this, Demo6Activity.class));
    }

    public void demo7(View view) {
        startActivity(new Intent(this, Demo7Activity.class));
    }

    public void demo8(View view) {
        startActivity(new Intent(this, Demo8Activity.class));
    }

    public void demo9(View view) {
        startActivity(new Intent(this, Demo9Activity.class));
    }

    public void demo10(View view) {
        startActivity(new Intent(this, Demo10Activity.class));
    }

}
