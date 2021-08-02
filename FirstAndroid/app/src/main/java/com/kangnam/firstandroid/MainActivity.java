package com.kangnam.firstandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView textResult;
    String num1, num2;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = (EditText)findViewById(R.id.Edit1);
        edit2 = (EditText)findViewById(R.id.Edit2);
        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button)findViewById(R.id.BtnSub);
        btnMul = (Button)findViewById(R.id.BtnMul);
        btnDiv = (Button)findViewById(R.id.BtnDiv);
        textResult = (TextView) findViewById(R.id.TextResult);

        ButtonListener listener = new ButtonListener();
        btnAdd.setOnClickListener(listener);
        btnSub.setOnClickListener(listener);
        btnMul.setOnClickListener(listener);
        btnDiv.setOnClickListener(listener);
    }

    private class ButtonListener implements View.OnClickListener {

        public void onClick(View view){
            num1 = edit1.getText().toString();
            num2 = edit2.getText().toString();
            if(num1.equals("")||num2.equals(""))
                Toast.makeText(getApplicationContext(),"숫자를 입력하세요!", Toast.LENGTH_LONG).show();
            else{
                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);
                switch (view.getId()){
                    case R.id.BtnAdd:
                        result = n1+n2; break;
                    case R.id.BtnSub:
                        result = n1-n2; break;
                    case R.id.BtnMul:
                        result = n1*n2; break;
                    case R.id.BtnDiv:
                        result = n1/n2; break;
                }
            }
            textResult.setText("계산 결과: " + result);
        }
    }
}
