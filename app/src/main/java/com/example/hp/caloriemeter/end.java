package com.example.hp.caloriemeter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by hp on 03/05/2015.
 */
public class end extends Activity implements View.OnClickListener {
    Double valget;
    TextView show;
    Button buttoned;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end);
        Intent i1 = this.getIntent();
        valget = i1.getDoubleExtra("key",0);
        initialze();
        if(valget > 0)
        {
            show.setText("Good Eating Habbits and calories remaining : "+valget);
        }
        else {
            show.setText("Should improve eating habits");
        }

    }

    private void initialze() {
        buttoned= (Button)findViewById(R.id.button);
        show = (TextView)findViewById(R.id.tvv1);
        buttoned.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent in = new Intent(this,FirstActivity.class);
        startActivity(in);
    }
}
