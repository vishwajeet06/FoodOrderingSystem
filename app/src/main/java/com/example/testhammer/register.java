package com.example.testhammer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button register = findViewById(R.id.btn_register);
        EditText rname = findViewById(R.id.txt_name);
        EditText remail = findViewById(R.id.txt_email);
        EditText rpass = findViewById(R.id.txt_pass);
        EditText rcnfpass = findViewById(R.id.txt_cnfpass);
        EditText rmobile = findViewById(R.id.txt_mobile);
    }
}
