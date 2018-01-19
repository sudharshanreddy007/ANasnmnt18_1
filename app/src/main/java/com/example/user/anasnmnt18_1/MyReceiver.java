package com.example.user.anasnmnt18_1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        int level= intent.getIntExtra(BatteryManager.EXTRA_LEVEL,0);

        Toast.makeText(context, "is"+String .valueOf(level), Toast.LENGTH_SHORT).show();
    }
}
