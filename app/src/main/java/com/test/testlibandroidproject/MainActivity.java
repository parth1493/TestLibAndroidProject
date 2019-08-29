package com.test.testlibandroidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.phone.Phone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Phone phone = new Phone("Harsh","445556666","Mobile");
        Log.i("TAG",phone.getContactName());
    }
}
