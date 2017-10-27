package com.ndasmohsquad.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_main);
        
        Thread logoTimer = new Thread() {
			public void run(){
				try{
					int logoTimer = 0;
					while(logoTimer < 6000){ // lamanya splash jika 6000 = 6 detik
						sleep(100);
						logoTimer = logoTimer +100;
					};
					startActivity(new Intent("com.ndasmohsquad.CLEARSCREEN"));
				} 
				
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				finally{
					finish();
				}
			}
		};
		
		logoTimer.start();
    }
}