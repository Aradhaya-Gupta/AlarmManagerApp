package com.example.alarmmanagerapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastFile extends BroadcastReceiver
{

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		// TODO Auto-generated method stub
		Toast.makeText(arg0, "Alarm bajgaya hai",Toast.LENGTH_SHORT).show();
	}

	
}
