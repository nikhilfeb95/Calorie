package com.example.hp.caloriemeter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by hp on 30/03/2015.
 */
public class mainpage extends Activity {
    Button b;
    private TextView displays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivepage);
        Intent i = this.getIntent();
        final Double bmr2 = i.getDoubleExtra("key", 0);
        displays = (TextView) findViewById(R.id.tv);
        displays.setText("The BMR is " + bmr2);
        b = (Button) findViewById(R.id.btmain);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent opengetbreakfast = new Intent(mainpage.this, getbreakfast.class);
                opengetbreakfast.putExtra("key", bmr2);
                startActivity(opengetbreakfast);


            }
        });

    }
}