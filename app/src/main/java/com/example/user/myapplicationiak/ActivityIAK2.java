package com.example.user.myapplicationiak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityIAK2 extends AppCompatActivity {

    Button tmbl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iak2);

        tmbl = (Button) findViewById(R.id.tombolmasuk);

        tmbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(ActivityIAK2.this, ActivityIAK.class);
                startActivity(i);
            }
        });
    }
}
