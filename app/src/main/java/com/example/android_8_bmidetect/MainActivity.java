package com.example.android_8_bmidetect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //按下按鈕
    public void count(View v) {
        final EditText mHeight = findViewById(R.id.ET_Height);
        final EditText mWeight = findViewById(R.id.ET_Weight);
        double bmi = 0;
        //計算bmi
        bmi = (Math.round((Double.parseDouble(mWeight.getText().toString()))/Math.pow(Double.parseDouble(mHeight.getText().toString()),2)*100));
        bmi = bmi/100;
        //換頁post資料
        Intent intent = new Intent(this, bmi_show.class);
        Bundle bundle = new Bundle();
        bundle.putString("key", String.valueOf(bmi));
        intent.putExtras(bundle);
        startActivity(intent);
    }
}