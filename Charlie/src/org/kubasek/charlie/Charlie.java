package org.kubasek.charlie;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Charlie extends Activity {
	public static String CHARLIE_EXTRA = "org.kubasek.charlie.extra";
	public static int CHARLIE_1_EXTRA_VAL = 1;
	public static int CHARLIE_2_EXTRA_VAL = 2;
	public static int CHARLIE_3_EXTRA_VAL = 3;
	public static int CHARLIE_4_EXTRA_VAL = 4;
	
	private Button btn1;
	private Button btn2;
	private Button btn3;
	private Button btn4;
	
	private Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_charlie);
		
		intent = new Intent(this, Video.class);
		
		btn1 = (Button)findViewById(R.id.btnVid1);
		
		btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
		    	intent.putExtra(CHARLIE_EXTRA, CHARLIE_1_EXTRA_VAL);
		    	startActivity(intent);
			}
		});
		
		btn2 = (Button)findViewById(R.id.btnVid2);
		
		btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
		    	intent.putExtra(CHARLIE_EXTRA, CHARLIE_2_EXTRA_VAL);
		    	startActivity(intent);
			}
		});
		
		btn3 = (Button)findViewById(R.id.btnVid3);
		
		btn3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
		    	intent.putExtra(CHARLIE_EXTRA, CHARLIE_3_EXTRA_VAL);
		    	startActivity(intent);
			}
		});
		
		btn4 = (Button)findViewById(R.id.btnVid4);
		
		btn4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
		    	intent.putExtra(CHARLIE_EXTRA, CHARLIE_4_EXTRA_VAL);
		    	startActivity(intent);
			}
		});
	}

}
