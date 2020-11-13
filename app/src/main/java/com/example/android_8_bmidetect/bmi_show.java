package com.example.android_8_bmidetect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class bmi_show extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_show);
        TV_show();
    }
    private void TV_show(){
        final TextView mbmidetect = findViewById(R.id.TV_bmidetect);
        final TextView mbmivalue = findViewById(R.id.TV_bmivalue);
        Bundle bundle = this.getIntent().getExtras();
        if(bundle != null) {
            String key = bundle.getString("key");
            mbmivalue.setText("你的BMI指數為"+key);
            double bmi = Double.parseDouble(key);
            if(bmi>18.5 && bmi <25){
                mbmidetect.setText("檢測結果為：正常");
            }else{
                mbmidetect.setText("檢測結果為：異常");
            }
        }
    }
}