package com.example.gitdeam;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class oneActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        //todo
        //你是谁的的啦
        Toast.makeText(this,"你是不是",Toast.LENGTH_LONG);
        Toast.makeText(this,"你是不是",Toast.LENGTH_LONG);
        Log.e("test","new new wenwewe");
    }
}
