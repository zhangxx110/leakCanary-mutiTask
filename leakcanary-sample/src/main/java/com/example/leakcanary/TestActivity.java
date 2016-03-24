package com.example.leakcanary;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by zhangxiongxiang on 2016/3/9.
 */
public class TestActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView view = new TextView(this);
        view.setText("this is test page");
    }
}
