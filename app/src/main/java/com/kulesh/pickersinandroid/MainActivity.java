package com.kulesh.pickersinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewDate(View view) {
        DatePicker fragment=new DatePicker();
        fragment.show(getSupportFragmentManager(),"Picker 1");
    }

    public void viewTime(View view) {
        TimePicker fragment=new TimePicker();
        fragment.show(getSupportFragmentManager(),"Picker 2");
    }
}