package com.example.user.biodatadirisqlite;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by user on 13/01/2018.
 */

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        //thread for splash screen running
        Thread logoTimer = new Thread() {
            public void run() {  //menginisialisasi timer splash berapa lama munculnya
                try {
                    sleep(5000); //5000=5detik karena menggunkan milisecond
                } catch (InterruptedException e) {
                    Log.d("Exception", "Exception" + e);
                } finally {
                    startActivity(new Intent(SplashScreen.this, MainActivity.class)); //setelah lima detik akan berpindah ke mainactivity
                }
                finish();
            }
        };
        logoTimer.start(); //logo timer dimulia dari 0 sampai waktu ditentukan
    }
}
