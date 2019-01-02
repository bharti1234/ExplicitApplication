package com.example.bharti.explicitapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    String msg;
    TextView v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        Bundle b = getIntent().getExtras();
        msg = b.getCharSequence("My value").toString();
        v=(TextView)findViewById(R.id.textView);
    }
    public void show(View view){
        v.setText(msg);
    }

}
