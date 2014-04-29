package com.theonebyte.anagram;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Seventeenth extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.seventeenth);
		Button send=(Button) findViewById(R.id.send);
		Button scramble = (Button) findViewById(R.id.scramble);
		final TextView jumbled=(TextView) findViewById(R.id.textView2);
		final TextView mod=(TextView) findViewById(R.id.TextView3);
		final EditText fixed=(EditText) findViewById(R.id.input);				
		final String word="experiment";
		final char[] array;
		array=new char[10];
		int j;
				
		for (int i = 0;i < word.length(); i++){
		    array[i]=(word.charAt(i));
		}
		for (j = 0; j<array.length; j++){
			Random pos = new Random();
			int randomPosition = pos.nextInt(array.length);
			int temp = array[j];
			array[j] = array[randomPosition];
			array[randomPosition] = (char) temp;
			String jumble=new String(array);
		}			
		final Thread next=new Thread(){
			public void run(){
				try{
					sleep(2000);
				}catch(InterruptedException e){
					e.printStackTrace();					
				}finally{
					Intent nextActivity= new Intent(Seventeenth.this,Eighteenth.class);
					startActivity(nextActivity);
					
					
				}
			}
		};
		
			
		    
		final String jumble=new String(array);
		jumbled.setText(jumble);
		send.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String check=fixed.getText().toString();
				if(check.equals(word)){
					mod.setText("Correct");	
					next.start();
				}else{
					mod.setText("Incorrect");
					fixed.setText("");
					
				}
				}
				
				
				
				
						
		});
		scramble.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent shuffle =new Intent(Seventeenth.this,Seventeenth.class);
				startActivity(shuffle);
			}
		});
		
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		finish();
	}
	
	

}
