package com.example.user.myapplicationiak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityIAK extends AppCompatActivity {

    TextView share, isi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iak);

        share = (TextView) findViewById(R.id.share);
        isi = (TextView) findViewById(R.id.isi);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT, isi.getText().toString());

                i.setType("text/plain");
                startActivity(i);
            }
        });
    }
}
