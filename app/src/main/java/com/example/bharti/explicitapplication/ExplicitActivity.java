package com.example.bharti.explicitapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ExplicitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit);
    }
    public void share(View v){
        Intent intent = new Intent(this,OtherActivity.class);
        intent.putExtra("My value","This is my information from main");
        startActivity(intent);
    }
}
