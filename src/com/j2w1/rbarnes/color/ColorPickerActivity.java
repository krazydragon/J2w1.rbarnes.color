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

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class ColorPickerActivity extends Activity implements SeekBar.OnSeekBarChangeListener{
	
	
	
	static int _redInt;
	static int _greenInt;
	static int _blueInt;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.picker);

        SeekBar redBar=(SeekBar)findViewById(R.id.RedBar);
        SeekBar greenBar=(SeekBar)findViewById(R.id.GreenBar);
        SeekBar blueBar=(SeekBar)findViewById(R.id.BlueBar);
        
        
        _redInt = 0;
        _greenInt = 0;
        _blueInt = 0;
        
        
        redBar.setOnSeekBarChangeListener(this);
        blueBar.setOnSeekBarChangeListener(this);
        greenBar.setOnSeekBarChangeListener(this);
    }
    
	@Override
	public void onProgressChanged(SeekBar seekBar, int progress,
			boolean fromUser) {
		
		
		TextView redBarText =(TextView)findViewById(R.id.RedBarText);
		TextView greenBarText=(TextView)findViewById(R.id.GreenBarText);
		TextView blueBarText=(TextView)findViewById(R.id.BlueBarText);
		TextView colorTextView=(TextView)findViewById(R.id.ColorView1);
		
		switch(seekBar.getId()){
		
		
		case R.id.RedBar:
			redBarText.setText(Integer.toString(progress));
			_redInt = progress;
			break;
			
		case R.id.BlueBar:
			blueBarText.setText(Integer.toString(progress));
			_blueInt = progress;
			break;
			
		case R.id.GreenBar:
			greenBarText.setText(Integer.toString(progress));
			_greenInt = progress;
			break;
		}
		
		colorTextView.setBackgroundColor(Color.rgb(_redInt, _greenInt, _blueInt));
	}

	@Override
	public void onStartTrackingTouch(SeekBar seekBar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStopTrackingTouch(SeekBar seekBar) {
		
		
		
		
		
	}

}
