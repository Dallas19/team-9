package com.example.canineassistanceteam9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
<<<<<<< HEAD
import android.widget.ImageButton;
=======
>>>>>>> 553d8edee8709da6c5b6b3cb819f3616ec181ba5
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class MainPage extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.aButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
<<<<<<< HEAD
        });

        ImageButton setting_image;
        setting_image =  (ImageButton) findViewById(R.id.setting_button);

        setting_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent questionPage = new Intent(this, QuestionPage);
                startActivity (questionPage);
            }
=======
>>>>>>> 553d8edee8709da6c5b6b3cb819f3616ec181ba5
        });

    }



<<<<<<< HEAD
=======

<<<<<<< HEAD




=======
>>>>>>> 670fe8a40011cf80d306aebcb4ba6456e7aa153f
public void openNewActivity (){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
>>>>>>> 553d8edee8709da6c5b6b3cb819f3616ec181ba5
}

}




