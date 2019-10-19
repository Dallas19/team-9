package com.example.canineassistanceteam9;


import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NotificationCompat;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

import static androidx.constraintlayout.widget.Constraints.TAG;


public class pushNotification extends AppCompatActivity {


    private  String NOTIFICATION_CHANNEL_ID = "";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_send_push);
       /* Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

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
<<<<<<< HEAD
        //FirebaseMessagingServices;
=======
        //NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID);
        //new FirebaseMessagingServices();

        NotificationCompat.Builder mBuilder;
        //...
        // Sets an ID for the notification
                int mNotificationId = 001;
        // Gets an instance of the NotificationManager service
                NotificationManager mNotifyMgr =
                        (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        // Builds the notification and issues it.
        String id="";
                  mBuilder =
                  new NotificationCompat.Builder(this,id)
                          .setSmallIcon(R.drawable.notification_icon)
                          .setContentTitle("My notification")
                           .setContentText("Hello World!");
                mNotifyMgr.notify(mNotificationId, mBuilder.build());


>>>>>>> 62e526c7162989049b07c733e15cb273c243e700
    }

}
/*
public class FirebaseMessagingServices extends com.google.firebase.messaging.FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        String notification_title = remoteMessage.getData().get("title");
        String notification_msg = remoteMessage.getData().get("body");
        String from_user_id = remoteMessage.getData().get("from_user_id");
        String click_action = remoteMessage.getData().get("click_action");

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        String NOTIFICATION_CHANNEL_ID = "channel_id_01";

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel notificationChannel = new NotificationChannel(NOTIFICATION_CHANNEL_ID, "My Notifications", NotificationManager.IMPORTANCE_HIGH);

            // Configure the notification channel.
            notificationChannel.setDescription("Channel description");
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(Color.BLUE);
            notificationChannel.setVibrationPattern(new long[]{0, 1000, 500, 1000});
            notificationChannel.enableVibration(true);

            notificationManager.createNotificationChannel(notificationChannel);

        }

        Intent intent = new Intent(click_action);
        intent.putExtra("user_id", from_user_id);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID);

        notificationBuilder.setAutoCancel(true).setDefaults(Notification.DEFAULT_ALL).setWhen(System.currentTimeMillis()).setSmallIcon(R.drawable.logo1).setPriority(Notification.PRIORITY_MAX).setContentTitle(notification_title).setContentText(notification_msg).setContentInfo("Info").setContentIntent(pendingIntent);


        int mNotificationId = (int) System.currentTimeMillis();
        notificationManager.notify(mNotificationId, notificationBuilder.build());
    }
}*/
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

