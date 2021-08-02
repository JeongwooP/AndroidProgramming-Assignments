package com.cookandroid.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView a;
    private double stored;
    private char Operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("계산기");

        a = (TextView)findViewById(R.id.text);
    }

    public void OC(View view){
        String b = a.getText().toString();
        switch (view.getId()){
            case R.id.btn0:
                a.setText(b + "0");
                break;
            case R.id.btn1:
                a.setText(b + "1");
                break;
            case R.id.btn2:
                a.setText(b + "2");
                break;
            case R.id.btn3:
                a.setText(b + "3");
                break;
            case R.id.btn4:
                a.setText(b + "4");
                break;
            case R.id.btn5:
                a.setText(b + "5");
                break;
            case R.id.btn6:
                a.setText(b + "6");
                break;
            case R.id.btn7:
                a.setText(b + "7");
                break;
            case R.id.btn8:
                a.setText(b + "8");
                break;
            case R.id.btn9:
                a.setText(b + "9");
                break;
            case R.id.dot:
                a.setText(b + ".");
                break;
            case R.id.clear:
                a.setText("");
                stored = 0.0;
                break;
            case R.id.plus:
                stored = Double.parseDouble(b);
                Operator = '+';
                a.setText("");
                break;
            case R.id.subtract:
                stored = Double.parseDouble(b);
                Operator = '-';
                a.setText("");
                break;
            case R.id.multiply:
                stored = Double.parseDouble(b);
                Operator = '*';
                a.setText("");
                break;
            case R.id.divide:
                stored = Double.parseDouble(b);
                Operator = '/';
                a.setText("");
                break;
            case R.id.ok:
                if(Operator == '+') stored = Double.parseDouble(b) + stored;
                if(Operator == '-') stored = Double.parseDouble(b) - stored;
                if(Operator == '*') stored = Double.parseDouble(b) * stored;
                if(Operator == '%') stored = Double.parseDouble(b) % stored;
                a.setText(Double.toString(stored));
                stored = 0.0;
                break;
        }
    }
}
