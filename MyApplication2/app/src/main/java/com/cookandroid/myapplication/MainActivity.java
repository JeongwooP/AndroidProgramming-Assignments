package com.cookandroid.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    LinearLayout a1;
    LinearLayout a2;
    LinearLayout a3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1 = (LinearLayout)findViewById(R.id.back1);
        a2 = (LinearLayout)findViewById(R.id.back2);
        a3 = (LinearLayout)findViewById(R.id.back3);

        a1.getWidth();
    }

    public void OC(View view) {
        switch (view.getId()){
            case R.id.back1:
                Toast.makeText(getApplicationContext(), a1.getWidth()+"x"+a1.getHeight(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.back2:
                Toast.makeText(getApplicationContext(), a2.getWidth()+"x"+a2.getHeight(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.back3:
                Toast.makeText(getApplicationContext(), a3.getWidth()+"x"+a3.getHeight(), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
