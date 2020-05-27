package com.example.testhammer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button login = findViewById(R.id.login);
        final Button regis = findViewById(R.id.signup);
        Button hdash = findViewById(R.id.dashhome);

        hdash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentdash = new Intent(MainActivity.this, dashboard.class);

                startActivity(intentdash);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentlogin = new Intent(MainActivity.this, login.class);

                startActivity(intentlogin);

            }
        });

        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentregis = new Intent(MainActivity.this, register.class);

                startActivity(intentregis);

            }
        });
    }
}
