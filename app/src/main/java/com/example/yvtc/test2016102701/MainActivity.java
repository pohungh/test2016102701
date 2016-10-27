package com.example.yvtc.test2016102701;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    ProgressBar pb,pb2;
    SeekBar sb;
    TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pb = (ProgressBar) findViewById(R.id.progressBar);
        pb2 = (ProgressBar) findViewById(R.id.progressBar2);
        sb = (SeekBar)findViewById(R.id.seekBar);
        tv1 = (TextView)findViewById(R.id.textView2);
        tv2 = (TextView)findViewById(R.id.textView3);

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tv1.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
    public void clickShow(View v)
    {
        pb.setVisibility(View.VISIBLE);
    }
    public void clickHide(View v)
    {
        pb.setVisibility(View.INVISIBLE);
    }
    public void click1(View v)
    {
        pb.setVisibility(View.VISIBLE);
        new Thread(){
            public void run(){
                super.run();
                try{
                    Thread.sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        pb.setVisibility(View.INVISIBLE);
                    }
                });
            }
        }.start();
    }
    public void click2(View v)
    {
        pb2.setProgress(pb2.getProgress()+10);
    }
    public void click3(View v)
    {
        String str = String.valueOf(sb.getProgress());
        tv2.setText(str);
    }
    public void click4(View v)
    {
        sb.setProgress(30);
    }

}
