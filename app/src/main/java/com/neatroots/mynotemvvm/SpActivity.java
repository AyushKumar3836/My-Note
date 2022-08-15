package com.neatroots.mynotemvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp);

        // hide toolbar
        getSupportActionBar().hide();

        // for splash screen
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // annonyms object
                startActivity(new Intent(SpActivity.this,MainActivity.class));
                finish();
            }
        },3000);

    }
}