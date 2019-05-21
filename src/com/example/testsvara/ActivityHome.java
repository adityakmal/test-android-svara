package com.example.testsvara;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;


public class ActivityHome extends Activity{
	
	ListView list;
	String Menu[]={"Playlist", "Music", "Artist", "Radio", "Radio Content", "Album", "Uploaded Content"};
	int icon[] = {R.drawable.icon_playlist, R.drawable.icon_music, R.drawable.icon_artist, R.drawable.icon_radio, R.drawable.icon_radio_content, R.drawable.icon_album, R.drawable.icon_upload_content};
	ImageView play;
	
	protected void onCreate (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		list = (ListView)findViewById(R.id.menu);
		play = (ImageView)findViewById(R.id.btnPlay);
		CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), Menu, icon);
		list.setAdapter(customAdapter);
		
		list.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int posisi,
					long arg3) {
				// TODO Auto-generated method stub
				switch(posisi){
				case 0:
					Intent i = new Intent(ActivityHome.this, ActivitySong.class);
					startActivity(i);
					break;
					
				case 1:
					Intent a = new Intent(ActivityHome.this, ActivitySong.class);
					startActivity(a);
					break;
					
				case 2:
					Intent b = new Intent(ActivityHome.this, ActivitySong.class);
					startActivity(b);
					break;
					
				case 3:
					Intent c = new Intent(ActivityHome.this, ActivitySong.class);
					startActivity(c);
					break;
					
				case 4:
					Intent d = new Intent(ActivityHome.this, ActivitySong.class);
					startActivity(d);
					break;
					
				case 5:
					Intent e = new Intent(ActivityHome.this, ActivitySong.class);
					startActivity(e);
					break;
					
				case 6:
					Intent f = new Intent(ActivityHome.this, ActivitySong.class);
					startActivity(f);
					break;
					
				default:
					break;
				}
			}
        });
		
		play.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(ActivityHome.this, ActivitySong.class);
				startActivity(i);
				ActivityHome.this.finish();
				
			}
		});
		
	}
}
