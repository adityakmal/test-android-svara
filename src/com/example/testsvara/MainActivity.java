package com.example.testsvara;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText uName, pWord;
	Button signin;
	String uname, pword;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uName = (EditText)findViewById(R.id.username);
        pWord = (EditText)findViewById(R.id.password);
        signin = (Button)findViewById(R.id.btnSignIn);
        
        signin.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				uname = String.valueOf(uName.getText());
				pword = String.valueOf(pWord.getText());
				if(uname.equals("svara") && pword.equals("123")){
					Intent i = new Intent(MainActivity.this, ActivityHome.class);
					startActivity(i);
					MainActivity.this.finish();
		        }
				else{
					Toast.makeText(getApplicationContext(), "Gagal Login", Toast.LENGTH_SHORT).show();
				}
			}
		});
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
