package com.example.clase23dejunio;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends Activity {
	// private EditText et1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // et1 =(EditText)findViewById(R.id.textView1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void abretesesamo(View view){
    	
    	
    	Intent hi =new Intent(this, Main2Activity.class );
    	//hi.putExtra("variable", et1.getText().toString());
    	startActivity(hi);
    	
    }
}
