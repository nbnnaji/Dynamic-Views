package com.example.nkechi_nnaji.androidui;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Dynamically adding xml layout
        LinearLayout rootView = (LinearLayout) findViewById(R.id.description_container);
        View child = getLayoutInflater().inflate(R.layout.job_description, rootView, false);
        rootView.addView(child);
        View child2= getLayoutInflater().inflate(R.layout.awards_description, rootView, false);
        rootView.addView(child2);
    }
}
