package com.example.peter.myuatest_android;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.unity3d.player.UnityPlayerActivity;


/**
 * Created by linweijie on 3/25/16.
 */
public class Bridge_Index extends UnityPlayerActivity {

    public static Activity activity = null;
    @Override
    public PendingIntent createPendingResult(int requestCode, Intent data, int flags) {
        return super.createPendingResult(requestCode, data, flags);
    }

    @Override
    protected void onCreate(Bundle bundle) {
        Log.d("Bridge_Index", "-- onCreate --");
        super.onCreate(bundle);
    }

    protected void StartActivityByUnity(final Activity activity_unity){
        Log.d("Bridge_Index", "-- StartActivityByUnity --");
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                activity = activity_unity;
                
                Log.d("Bridge_Index", "+++ start activity : MainActivity.class");
                activity_unity.startActivity(new Intent(activity_unity, MainActivity.class));
            }
        });
    }

    protected void ToastMessage(final Activity activity, final String message){
        Log.d("Bridge_Index", "-- ToastMessage --");
        runOnUiThread(new Runnable() {
            @Override
            public void run() {

                Toast.makeText(activity, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
