package com.example.hp.caloriemeter;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by hp on 29/04/2015.
 */
public class getdinner extends Activity implements View.OnClickListener , RadioGroup.OnCheckedChangeListener
{
    Button b1;
    RadioGroup rg;
    TextView display;
    Double obtain,cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.getdinner);
        Intent i1 = this.getIntent();
        obtain = i1.getDoubleExtra("key", 0);
        initialize();
    }

    private void initialize() {
        b1 = (Button)findViewById(R.id.btn);
        rg = (RadioGroup)findViewById(R.id.rg1);
        display = (TextView)findViewById(R.id.tvv);
        b1.setOnClickListener(this);
        rg.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.radio:
                if(obtain >376 ){
                    cal = obtain - 376;
                    display.setText("  ");}
                else
                {
                    display.setText("This exceeds your calorie limit");
                    cal=obtain;
                }
                break;
            case R.id.radio2:
                if(obtain >324){
                    cal = obtain - 324;
                display.setText("  ");}
                else
                {
                    display.setText("This exceeds your calorie limit");
                    cal=obtain;
                }
                break;
            case R.id.radio3:
                if(obtain >184)  {
                    cal = obtain - 184;
                    display.setText("  ");}
                else
                {
                    display.setText("This exceeds your calorie limit");
                    cal=obtain;
                }
                break;
            case R.id.radio4:
                if(obtain >320){
                    cal = obtain - 320;
                    display.setText("  ");}
                else
                {
                    display.setText("This exceeds your calorie limit");
                    cal=obtain;
                }
                break;
            case R.id.radio5:
                if(obtain >285 ){
                    cal = obtain - 285;
                    display.setText("  ");}
                else
                {
                    display.setText("This exceeds your calorie limit");
                    cal=obtain;
                }
                break;
        }
    }

    @Override
    public void onClick(View v) {
            Double dople;

            dople = cal;
            Intent opo = new Intent(this ,end.class);
            opo.putExtra("key",dople);
            startActivity(opo);
    }
}
