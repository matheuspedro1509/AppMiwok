package com.example.matheus.appcurso3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtView = (TextView) findViewById(R.id.numbers);

        txtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, NumerosActivity.class);
                startActivity(intent);
            }
        });


        TextView txtView2 = (TextView) findViewById(R.id.phrases);

        txtView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FrasesActivity.class);
                startActivity(intent);
            }
        });

        TextView txtView3 = (TextView) findViewById(R.id.family);

        txtView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FamiliaActivity.class);
                startActivity(intent);
            }
        });

        TextView txtView4 = (TextView) findViewById(R.id.colors);

        txtView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CoresActivity.class);
                startActivity(intent);
            }
        });
    }

}


