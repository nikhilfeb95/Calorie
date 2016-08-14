package com.example.hp.caloriemeter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by hp on 26/04/2015.
 */
public  class getbreakfast extends Activity implements View.OnClickListener , RadioGroup.OnCheckedChangeListener {

    RadioGroup rg;
    Button b1;
    Double bmrb1 ,bmrb;
    TextView display;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i1 = this.getIntent();
        bmrb = i1.getDoubleExtra("key", 0);
        setContentView(R.layout.getbreakval);
        initialize();}

    private void initialize() {

        b1 = (Button) findViewById(R.id.bbrk);
        rg = (RadioGroup) findViewById(R.id.rgg0);
        b1.setOnClickListener(this);
        rg.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.radioButton:
                bmrb1 = bmrb - 272;
                break;
            case R.id.radioButton2:
                bmrb1 = bmrb - 632;
                break;
            case R.id.radioButton3:
                bmrb1 = bmrb - 356;  //taking average of 4 slices of toasted bread and butter
                break;
            case R.id.radioButton4:
                bmrb1 = bmrb - 325;
                break;
            case R.id.radioButton5:
                bmrb1 = bmrb - 100; // one average bowl of cornflakes
                break;
            case R.id.radioButton6:
                bmrb1 = bmrb - 175; // Taking an average of two idli pieces
                break;
            case R.id.radioButton7:
                bmrb1 = bmrb - 320; //per serving
                break;
            case R.id.radioButton8:
                bmrb1 = bmrb - 275; //per bowl of poha
                break;
            case R.id.radioButton9:
                bmrb1 = bmrb - 375;//per 3 medium poories
                break;
            case R.id.radioButton10:
                bmrb1 = bmrb - 316;
                break;
        }
    }


    @Override
    public void onClick(View v) {
        Double brk;

        brk = bmrb1;
        Intent o = new Intent(this, getlunch.class);
        o.putExtra("key", brk);
        startActivity(o);
    }
}

