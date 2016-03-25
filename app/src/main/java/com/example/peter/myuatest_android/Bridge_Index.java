package com.example.peter.myuatest_android;

import android.content.Intent;
import android.os.Bundle;

import com.unity3d.player.UnityPlayerActivity;

/**
 * Created by linweijie on 3/25/16.
 */
public class Bridge_Index extends UnityPlayerActivity {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    protected void StartActivityByUnity(){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Bridge_Index.this, MainActivity.class));
                Bridge_Index.this.finish();
            }
        });
    }
}
