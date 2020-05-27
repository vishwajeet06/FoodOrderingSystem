package com.example.testhammer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        CardView search = findViewById(R.id.dsearch);
        CardView contact = findViewById(R.id.dcontact);
        CardView map = findViewById(R.id.dmap);
        CardView partner = findViewById(R.id.dpartner);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentsearch = new Intent(dashboard.this, search.class);

                startActivity(intentsearch);
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentcontact = new Intent(dashboard.this, contact.class);

                startActivity(intentcontact);
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentmap = new Intent(dashboard.this, map.class);

                startActivity(intentmap);
            }
        });

        partner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentpartner = new Intent(dashboard.this, partner.class);

                startActivity(intentpartner);
            }
        });
    }
}
