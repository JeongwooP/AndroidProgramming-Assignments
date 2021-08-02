package com.cookandroid.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button b;
    ImageView img;
    int move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button)findViewById(R.id.btn);
        img = (ImageView)findViewById(R.id.pic);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                move = move + 10;
                img.setRotation(move);
            }
        });
    }
}
