package com.cookandroid.project4_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button mybutton1;
    private Button mybutton2;
    private Button mybutton3;
    private Button mybutton4;
    private Button mybutton5;
    private TextView rslt;
    private Double rslt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.edittext1);
        num2 = (EditText)findViewById(R.id.edittext2);

        mybutton1 = (Button)findViewById(R.id.add);
        mybutton2 = (Button)findViewById(R.id.subtract);
        mybutton3 = (Button)findViewById(R.id.mul);
        mybutton4 = (Button)findViewById(R.id.div);
        mybutton5 = (Button)findViewById(R.id.out);


        rslt = (TextView)findViewById(R.id.result);


        mybutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().toString().equals("") || num2.getText().toString().equals(""))
                    Toast.makeText(MainActivity.this, "값을 입력하세요.", Toast.LENGTH_LONG).show();
                else {
                    rslt1 = Double.parseDouble(num1.getText().toString()) + Double.parseDouble(num2.getText().toString());
                    rslt.setText("계산결과: " + rslt1);
                }
                }
        });
        mybutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rslt1 = Double.parseDouble(num1.getText().toString()) - Double.parseDouble(num2.getText().toString());
                rslt.setText("계산결과: " + rslt1);
            }
        });
        mybutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rslt1 = Double.parseDouble(num1.getText().toString()) * Double.parseDouble(num2.getText().toString());
                rslt.setText("계산결과: " + rslt1);
            }
        });
        mybutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rslt1 = Double.parseDouble(num1.getText().toString()) / Double.parseDouble(num2.getText().toString());
                rslt.setText("계산결과: " + rslt1);
            }
        });
        mybutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().toString().equals("") || num2.getText().toString().equals("") || num2.getText().toString().equals("0"))
                    Toast.makeText(MainActivity.this, "값을 입력하세요.", Toast.LENGTH_LONG).show();
                else {
                    rslt1 = Double.parseDouble(num1.getText().toString()) % Double.parseDouble(num2.getText().toString());
                    rslt.setText("계산결과: " + rslt1);
                }
            }
        });

    }
}
