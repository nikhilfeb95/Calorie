package com.example.hp.caloriemeter;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

/**
 * Created by hp on 26/03/2015.
 */
public class firstpage extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstpage);
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();//Used for debugging tries different combos to find error
                }finally                /* TO check after debugging ....i.e after try block */
                {
                    Intent openFirstActivity = new Intent("android.intent.action.FirstActivity");
                    startActivity(openFirstActivity);
                }

            }
        };
        timer.start();

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}



