package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TimePicker;
import android.widget.Button;
import android.widget.Toast;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimePicker time=(TimePicker) findViewById(R.id.tmpkr);
        time.setIs24HourView(true);
        Button b1=(Button) findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hour,minute;
                hour=time.getCurrentHour();
                minute=time.getCurrentMinute();
                Toast.makeText(getApplicationContext(),"Time is:"+hour+":"+minute,Toast.LENGTH_LONG).show();


            }
        });
    }
}