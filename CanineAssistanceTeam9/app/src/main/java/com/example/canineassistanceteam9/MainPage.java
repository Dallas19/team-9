package com.example.canineassistanceteam9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class MainPage extends AppCompatActivity {
    private Button button;
    ImageButton setting_button;
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
        });

        setting_button =(ImageButton) findViewById(R.id.setting_button);
        setting_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //openQuestionPage();
            }
        });
    }

    public void openNewActivity (){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

<<<<<<< HEAD


=======
//    public void openQuestionPage(){
//        Intent intent = new Intent(this, QuestionPage.class);
//        startActivity(intent);
//    }
>>>>>>> 1f7ce4ef1968d84fc4e2551567185b612a5bf0d0

}




