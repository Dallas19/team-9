package com.example.canineassistanceteam9;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView diabetes = (ImageView) findViewById(R.id.imageButton2);
        ImageView e911 = (ImageView) findViewById(R.id.imageButton);
        ImageView seizure = (ImageView) findViewById(R.id.imageButton3);
        //FloatingActionButton fab = findViewById(R.id.fab);
        diabetes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                //needs to reference to the a diabetes page
                //startActivity(new Intent(Main2Activity.this, InsurancePage.class));

                playSound();

            }
        });

        e911.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound();//make a new function to change the sound

            }
        });

        seizure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound();//make a new function to change the sound

            }
        });

        }

        public void playSound(){
            MediaPlayer player = MediaPlayer.create(this,R.raw.beep);
            player.start();
    }

}
