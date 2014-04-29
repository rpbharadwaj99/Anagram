package com.theonebyte.anagram;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class End extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.end);
		Button replay = (Button) findViewById (R.id.Replay);
		replay.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent Replay = new Intent(End.this,First.class);
				startActivity(Replay);
				
			}
				
				
				
						
		});
		
		
}
}	