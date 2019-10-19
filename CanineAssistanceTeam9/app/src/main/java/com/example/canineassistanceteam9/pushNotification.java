package com.example.canineassistanceteam9;


import android.os.Bundle;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.google.firebase.messaging.FirebaseMessagingService;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

import static androidx.constraintlayout.widget.Constraints.TAG;


public class pushNotification extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_send_push);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendPush();
            }
        });
    }

    public void sendPush(){
        //FirebaseInstanceId.getInstance().getInstanceId();
        //FirebaseMessagingServices;
    }

}
 class FirebaseMessagingServices extends FirebaseMessagingService{
    /*FirebaseInstanceId.getInstance().getInstanceId()
        .addOnCompleteListener(new OnCompleteListener<InstanceIdResult>() {
         @Override
         public void onComplete(@NonNull Task<InstanceIdResult> task) {
             if (!task.isSuccessful()) {
                 Log.w(TAG, "getInstanceId failed", task.getException());
                 return;
             }

             // Get new Instance ID token
             String token = task.getResult().getToken();

             // Log and toast
             String msg = getString(R.string.msg_token_fmt, token);
             Log.d(TAG, msg);
             Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
         }
     });

     /**
      * Called if InstanceID token is updated. This may occur if the security of
      * the previous token had been compromised. Note that this is called when the InstanceID token
      * is initially generated so this is where you would retrieve the token.
      */

     @Override
     public void onNewToken(String token) {
         Log.d(TAG, "Refreshed token: " + token);

         // If you want to send messages to this application instance or
         // manage this apps subscriptions on the server side, send the
         // Instance ID token to your app server.
         sendRegistrationToServer(token);
     }

     private void sendRegistrationToServer(String token) {
         System.out.println(token);
     }

 }

