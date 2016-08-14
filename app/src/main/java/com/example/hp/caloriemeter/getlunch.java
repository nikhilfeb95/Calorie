package com.example.hp.caloriemeter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by hp on 28/04/2015.
 */

public class getlunch extends Activity implements View.OnClickListener , RadioGroup.OnCheckedChangeListener {
    Double nb,bmrb1;
    RadioGroup rg;
    Button b1;
    TextView disp,disp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i1 = this.getIntent();
        bmrb1 = i1.getDoubleExtra("key", 0);
        setContentView(R.layout.getlunch);
        initialize();
    }

    private void initialize() {
        b1 = (Button) findViewById(R.id.button1);
        rg = (RadioGroup) findViewById(R.id.rgg1);
        disp = (TextView) findViewById(R.id.Text2);
        disp1 = (TextView) findViewById(R.id.ind);
        b1.setOnClickListener(this);
        rg.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.rb0:
                if (bmrb1 > 3340) {
                    nb = bmrb1 - 3340; // taking an average amount of biryani
                    disp.setText("  ");
                } else
                    disp.setText("This exceeds your calorie limit");
                break;
            case R.id.rb1:
                if (bmrb1 > 696) {
                    disp.setText("  ");
                    nb = bmrb1 - 696;
                } else
                    disp.setText("This exceeds your calorie limit");
                break;
            case R.id.rb2:
                if (bmrb1 > 981){
                    nb = bmrb1 - 981;
                    disp.setText("  ");
        }
                else
                    disp.setText("This exceeds your calorie limit");
                break;
            case R.id.rb3:
                if (bmrb1 > 753){
                    nb = bmrb1 - 753;
                    disp.setText("  ");}
                else
                    disp.setText("This exceeds your calorie limit");
                break;
            case R.id.rb4:
                if (bmrb1 > 631){
                    nb = bmrb1 - 631;
                    disp.setText("  ");}
                else
                    disp.setText("This exceeds your calorie limit");
                break;
            case R.id.rb5:
                if (bmrb1 > 412){
                    nb = bmrb1 - 412;
                    disp.setText("  ");}
                else
                    disp.setText("This exceeds your calorie limit");
                break;
            case R.id.rb6:
                if (bmrb1 > 736){
                    nb = bmrb1 - 736;
                    disp.setText("  ");}
                else
                    disp.setText("This exceeds your calorie limit");
                break;
            case R.id.rb7:
                if (bmrb1 > 780)
                {
                    nb = bmrb1 - 780;
                    disp.setText("  ");}
                else
                    disp.setText("This exceeds your calorie limit");
                break;
            case R.id.rb8:
                if (bmrb1 > 3340){
                    nb = bmrb1 - 3340;
                    disp.setText("  ");}
                else
                    disp.setText("This exceeds your calorie limit");
                break;
            case R.id.rb9:
                if (bmrb1 > 342){
                    nb = bmrb1 - 342;
                    disp.setText("  ");}
                else
                    disp.setText("This exceeds your calorie limit");
                break;
        }
        disp1.setText("Everytings working" + nb);
    }

    @Override
    public void onClick(View v) {
        Double bb = nb;
        Intent n = new Intent(getlunch.this, getdinner.class);
        n.putExtra("key", bb);
        startActivity(n);
    }
}


