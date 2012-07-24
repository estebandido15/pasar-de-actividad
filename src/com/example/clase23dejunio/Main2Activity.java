package com.example.clase23dejunio;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Main2Activity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
      //  Bundle bundle=getIntent().getExtras();
        
       // String valor1=et1.getText().toString();
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main2, menu);
        return true;
    }
    
 public void abretesesamo2(View view){
    	
    	
    	Intent hi =new Intent(this, MainActivity.class );
    	startActivity(hi);
    	
    }
}
