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
import android.graphics.Color;
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
			startActivityForResult(pickerIntent,0);
			
		}
        });
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.color_main, menu);
		return true;
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	  if (resultCode == RESULT_OK && requestCode == 0) {
		  super.onActivityResult(requestCode, resultCode, data);
		  if(data.getExtras().containsKey("redInfo")){
			  
			  View view = (View)findViewById(R.id.MainLayout);
			  view.setBackgroundColor(Color.rgb(data.getIntExtra("redInfo", 0), data.getIntExtra("greenInfo", 0), data.getIntExtra("blueInfo", 0)));
			  
			  //width.setText(data.getStringExtra("widthInfo"));

			   

			          }

	  }
	}

}
