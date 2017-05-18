package com.demoytcompilelib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pcube.logutil.LogDebug;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogDebug.d("Welcom...!!");
    }
}
