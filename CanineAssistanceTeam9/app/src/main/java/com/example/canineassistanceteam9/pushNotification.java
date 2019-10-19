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
       // FirebaseMessagingServices
    }

}
 /*class FirebaseMessagingServices extends FirebaseMessagingService{
     @Override
     public void onNewToken(String s) {
         super.onNewToken(s);
         Log.e("newToken", s);
         getSharedPreferences("_", MODE_PRIVATE).edit().putString("fb", s).apply();
     }

     @Override
     public void onMessageReceived(RemoteMessage remoteMessage) {
         super.onMessageReceived(remoteMessage);
     }

     public static String getToken(Context context) {
         return context.getSharedPreferences("_", MODE_PRIVATE).getString("fb", "empty");
     }
 }

     /**
      * Called if InstanceID token is updated. This may occur if the security of
      * the previous token had been compromised. Note that this is called when the InstanceID token
      * is initially generated so this is where you would retrieve the token.
      */

    /* @Override
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

 }*/

