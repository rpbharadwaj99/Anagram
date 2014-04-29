package com.theonebyte.anagram;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Thread timer=new Thread(){
			public void run(){
				try{
					sleep(5000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent openActivity = new Intent(Main.this,First.class);
					startActivity(openActivity);
				}
			}
		};
		timer.start();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		finish();
	}

	
	

}
 