package com.mmt.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Pratiksha's code
        //For loop
        //Parsing
        //JSON Manipulation

        addition(10, 20);
    }

    protected void addition( int a, int b)
    {
        return a + b;
    }
}

