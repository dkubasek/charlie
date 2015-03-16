package org.kubasek.charlie;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends Activity {
	private VideoView vid;
	private int charlid;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_video);
		// Show the Up button in the action bar.
		
		vid = (VideoView)findViewById(R.id.video);
		int episode = getIntent().getIntExtra(Charlie.CHARLIE_EXTRA, Charlie.CHARLIE_1_EXTRA_VAL);
		
		switch (episode) {
			case 1:
				charlid = R.raw.charlie1;
				break;
			case 2:
				charlid = R.raw.charlie2;
				break;
			case 3:
				charlid = R.raw.charlie3;
				break;
			case 4:
				charlid = R.raw.charlie4;
				break;
			default:
				charlid = R.raw.charlie1;
		}
		
		Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + charlid);
		vid.setVideoURI(uri);
		
		MediaController mc = new MediaController(this);
	    mc.setAnchorView(vid);
		vid.setMediaController(mc);
		vid.start();
	}
}
