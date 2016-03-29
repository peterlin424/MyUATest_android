package com.example.peter.myuatest_android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.unity3d.player.UnityPlayer;

public class MainActivity extends Activity {

    public static Activity activity = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        activity = this;

        Button bt_go_page1 = (Button)findViewById(R.id.button1);
        Button bt_go_page2 = (Button)findViewById(R.id.button2);

        bt_go_page1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                UnityPlayer.UnitySendMessage("GameObjectName", "MethodName", "parameters");
                UnityPlayer.UnitySendMessage("Main Camera", "ToastMessage", "goUnityPage1 is called");
                UnityPlayer.UnitySendMessage("Main Camera", "goUnityPage1", "");
                finish();
            }
        });

        bt_go_page2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                UnityPlayer.UnitySendMessage("GameObjectName", "MethodName", "parameters");
                UnityPlayer.UnitySendMessage("Main Camera", "ToastMessage", "goUnityPage2 is called");
                UnityPlayer.UnitySendMessage("Main Camera", "goUnityPage2", "");
                finish();
            }
        });
    }

//    @Override
//    public void onBackPressed() {
//        if (Bridge_Index.UnityActivity!=null){
//            Bridge_Index.UnityActivity.finish();
//        }
//    }
}
