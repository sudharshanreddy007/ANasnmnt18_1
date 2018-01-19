package com.example.user.anasnmnt18_1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView txt;

MyReceiver myReceiver;
    BroadcastReceiver broadcastReceiver=new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            int level= intent.getIntExtra(BatteryManager.EXTRA_LEVEL,0);

            txt.setText( "BATTERY LEVEL IS  "+ String.valueOf(level));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.text);
        this.registerReceiver(broadcastReceiver,new IntentFilter(Intent.ACTION_BATTERY_CHANGED));

    }
}