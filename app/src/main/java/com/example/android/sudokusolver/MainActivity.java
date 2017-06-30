package com.example.android.sudokusolver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity
{

    private static final String TAG = "MainActivity";

    //Test OpenCVLibrary

    static {
        if (OpenCVLoader.initDebug())
        {
            Log.d(TAG, "OpenCV successfully loaded");
        }
        else
        {
            Log.d(TAG, "OpenCV not loaded");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
