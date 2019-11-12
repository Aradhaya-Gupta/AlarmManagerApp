package com.example.alarmmanagerapp;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button btn1;
	EditText ed1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ed1=(EditText)findViewById(R.id.editText1);
		btn1=(Button)findViewById(R.id.button1);
		btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Integer t=Integer.parseInt(ed1.getText().toString());
				Intent i=new Intent(getApplicationContext(),MyBroadcastFile.class);
				PendingIntent pi=PendingIntent.getBroadcast(getApplicationContext(), 0, i, 0);
				AlarmManager am=(AlarmManager)getSystemService(ALARM_SERVICE);
				am.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+(t*1000), pi);
				Toast.makeText(getApplicationContext(), "Alarm Set", Toast.LENGTH_SHORT).show();
			}
		});
	}
}
