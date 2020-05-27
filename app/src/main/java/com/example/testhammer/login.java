package com.example.testhammer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button userlogin = findViewById(R.id.btn_login);
        EditText username = findViewById(R.id.email);
        EditText userpass = findViewById(R.id.password);


    }
}
