package com.mmt.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    void myfunction(){
        //Do nothing.
    }

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

    protected int addition( int a, int b)
    {
        return a + b;
    }

    protected int sub( int a, int b)
    {
        return a - b;
    }
}

