package com.example.jregalado.a5vistas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button siguiente,siguiente2,siguiente3,siguiente4,siguiente5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        siguiente = (Button)findViewById(R.id.btn1);
        siguiente2 = (Button)findViewById(R.id.btn2);
        siguiente3 = (Button)findViewById(R.id.btn3);
        siguiente4 = (Button)findViewById(R.id.btn4);
        siguiente5 = (Button)findViewById(R.id.btn5);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(siguiente);
            }
        });

        siguiente2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente2 = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(siguiente2);
            }
        });

        siguiente3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente3 = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(siguiente3);
            }
        });

        siguiente4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente4 = new Intent(MainActivity.this, Main5Activity.class);
                startActivity(siguiente4);
            }
        });
        siguiente5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente5 = new Intent(MainActivity.this, Main6Activity.class);
                startActivity(siguiente5);
            }
        });
    }
}
