package com.example.hp.caloriemeter;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class FirstActivity extends ActionBarActivity {
    private TextView display;
    EditText editText0;
    EditText editText1;
    EditText editText2;
    EditText editText3;
    Button first;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        calvars();


        first.setOnClickListener(new View.OnClickListener() {//Making the button do something when we click it
            @Override
            public void onClick(View v) {//Creating a new function this way
                //Your code here buddy
                calvars();
                Double height = Double.parseDouble(editText1.getText().toString());
                Double weight = Double.parseDouble(editText2.getText().toString());
                Double age = Double.parseDouble(editText3.getText().toString());
                String sex=editText0.getText().toString();
                Double bmr;
                if (sex.contentEquals("M"))
                {
                    bmr = (65 + (6.2 * weight) + (12.7 * height)) - (6.8 * age);
                    display.setText("Your calorie consumption per day should be" + bmr);
                }
                else
                {
                    bmr = 655+(4.3*weight)+(4.3*height)-(4.7*age);
                    display.setText("Your Calorie consumption per day should be" + bmr);
            }
                Intent openmainpage=new Intent(FirstActivity.this,mainpage.class);
                openmainpage.putExtra("key", bmr);
                startActivity(openmainpage);
        }



    });
    }

    private void calvars() {
        first=(Button) findViewById(R.id.buttonentry);
        display = (TextView) findViewById(R.id.tv1);
        editText0 = (EditText) findViewById(R.id.entry0);
        editText1 = (EditText) findViewById(R.id.entry1);
        editText2 = (EditText) findViewById(R.id.entry2);
        editText3 = (EditText) findViewById(R.id.entry3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_first, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
