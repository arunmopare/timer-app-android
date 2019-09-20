package com.example.mymomtimesr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView mnumber = (TextView) findViewById(R.id.mnumber);
        final TextView result = (TextView) findViewById(R.id.done);
        new CountDownTimer(10000,1000){
            public void onTick(long millisecsUntilDone){
                mnumber.setText("Time: "+String.valueOf(millisecsUntilDone/1000));
            }
            public void onFinish(){
                result.setText("Done...!!!");

            }
        }.start();
    }
}
