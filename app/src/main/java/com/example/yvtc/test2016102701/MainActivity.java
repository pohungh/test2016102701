package com.example.yvtc.test2016102701;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;


public class MainActivity extends AppCompatActivity {
    ProgressBar pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pb = (ProgressBar) findViewById(R.id.progressBar);
    }
    public void clickShow(View v)
    {
        pb.setVisibility(View.VISIBLE);
    }
    public void clickHide(View v)
    {
        pb.setVisibility(View.INVISIBLE);
    }
}
