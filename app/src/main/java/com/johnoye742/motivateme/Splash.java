package com.johnoye742.motivateme;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toolbar;


public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setActionBar(toolbar);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener((v) -> finish());
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/MavenPro.ttf");
        ((TextView) findViewById(R.id.developer)).setTypeface(tf);
        ((TextView) findViewById(R.id.name)).setTypeface(tf);
        ((TextView) findViewById(R.id.desc)).setTypeface(tf);
    }
}