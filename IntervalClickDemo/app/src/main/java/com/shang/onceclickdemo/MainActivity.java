package com.shang.onceclickdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.lizhaoxuan.onceclickdemo.R;
import com.shang.onceclick.IntervalClick;
import com.shang.OnceClick;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntervalClick.inject(this);
        text = (TextView) findViewById(R.id.textView);
    }

    @OnceClick(id=R.id.btn,time = 10000)
    public void once() {

        //点击事件
        Log.d("tag", "onceMe:" + System.currentTimeMillis());
    }

    @OnceClick(id = R.id.btn2,time = 5000)
    public void onceMe(View v) {
        ((Button) v).setText("click" + num++);
        Log.d("tag", "onceMe");
    }
}
