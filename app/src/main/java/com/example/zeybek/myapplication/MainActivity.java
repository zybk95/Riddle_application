package com.example.zeybek.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

import static com.example.zeybek.myapplication.R.id.textView3;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tw= (TextView) findViewById(R.id.textView4);
        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        tw.setText(R.string.bilmece_cevabı);
    }
}