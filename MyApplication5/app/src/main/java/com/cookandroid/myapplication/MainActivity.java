package com.cookandroid.myapplication;


import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup rGroup1;
    RadioButton rDog, rCat, rRab, rHor;
    View dialogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rGroup1 = (RadioGroup)findViewById(R.id.rG);
        rDog = (RadioButton)findViewById(R.id.dog);
        rCat = (RadioButton)findViewById(R.id.cat);
        rRab = (RadioButton)findViewById(R.id.rabbit);
        rHor = (RadioButton)findViewById(R.id.horse);


        final Button button1= (Button)findViewById(R.id.pic);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               dialogView = (View)View.inflate(MainActivity.this, R.layout.dialog1, null);
               final AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
               final ImageView digView1 = dialogView.findViewById(R.id.pic);
                dlg.setView(digView1);
                switch (rGroup1.getCheckedRadioButtonId()){
                    case R.id.dog:
                        dlg.setTitle("강아지");
                        digView1.setImageResource(R.drawable.dog);
                        dlg.setNegativeButton("닫기", null);
                        dlg.show();
                        break;
                }
            }
        });
    }
}
