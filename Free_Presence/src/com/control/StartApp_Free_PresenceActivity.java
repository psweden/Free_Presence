
package com.control;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.model.DatePickerFragment;
import com.model.TimePickerFragment;

public class StartApp_Free_PresenceActivity extends FragmentActivity
{
	public void onCreate(Bundle icicle)
	   {
	      super.onCreate(icicle);
	      
	      setContentView(R.layout.mainpresence);
	      
	      View title = getWindow().findViewById(android.R.id.title);
	      View titleBar = (View) title.getParent();
	      titleBar.setBackgroundColor(Color.parseColor("#3b5998"));
	      ((TextView) title).setGravity(Gravity.CENTER);
	      
	      
	   // ROTERA INTE screen
	      setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	 
	   }
	public void showTimePickerDialog(View v) {
	    DialogFragment newFragment = new TimePickerFragment();
	    newFragment.show(getSupportFragmentManager(), "timePicker");
	}
	
	public void showDatePickerDialog(View v) {
	    DialogFragment newFragment = new DatePickerFragment();
	    newFragment.show(getSupportFragmentManager(), "datePicker");
	}
}