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
import android.view.Menu;

public class ColorMainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_color_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.color_main, menu);
		return true;
	}

}
