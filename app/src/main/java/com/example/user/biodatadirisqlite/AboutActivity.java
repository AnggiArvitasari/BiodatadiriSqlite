package com.example.user.biodatadirisqlite;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by user on 13/01/2018.
 */

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


    }
    public void facebook(View v) {

        Intent browserIntent = new Intent(
                Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/anggi.arvitasari.7"));
        startActivity(browserIntent);
    }
    public void instagram(View v) {
        Intent browserIntent = new Intent(
                Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/anggiarvitasari/"));
        startActivity(browserIntent);
    }
    public void twitter(View v) {
        Intent browserIntent = new Intent(
                Intent.ACTION_VIEW, Uri.parse("https://twitter.com/Avita_sarii"));
        startActivity(browserIntent);
    }
}
