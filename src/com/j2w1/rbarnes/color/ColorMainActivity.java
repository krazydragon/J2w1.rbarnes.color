/*
 * project	J2w1.rbarnes.color
 * 
 * package	com.j2w1.rbarnes.color
 * 
 * @author	Ronaldo Barnes
 * 
 * date		Mar 6, 2013
 */
package com.j2w1.rbarnes.color;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class ColorMainActivity extends Activity {
	
	Intent pickerIntent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_color_main);
		
		final Intent pickerIntent = new Intent(this, ColorPickerActivity.class);
		Button pickButton = (Button) findViewById(R.id.PickButton);
		
		
		pickButton.setOnClickListener(new Button.OnClickListener() {  
		@Override
		public void onClick(View v) {
			startActivity(pickerIntent);
			
		}
        });
		
		
		
		
		
		
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.color_main, menu);
		return true;
	}

}
