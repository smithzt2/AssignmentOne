package com.example.zachary.andoidone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
String pass = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt = (TextView) findViewById(R.id.welcomeTxt);
    }


    public  void onClick(View view){
        Intent i = new Intent(this, Main2Activity.class);
        final int result = 1;
        startActivityForResult(i, 1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView  display = (TextView) findViewById(R.id.welcomeTxt);
        String password = data.getStringExtra("Password");
        if(password.equals("1234")){
            display.setText("The app is unlocked.");
        }
    }
}




