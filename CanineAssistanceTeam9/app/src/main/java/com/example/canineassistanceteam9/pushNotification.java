package com.example.canineassistanceteam9;


import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

public class pushNotification extends AppCompatActivity{


        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.content_send_push);
            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            Button fab = findViewById(R.id.button2);
            fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                //startActivity(new Intent(pushNotification.this, InsurancePage.class));
            }
        });
        }

}


