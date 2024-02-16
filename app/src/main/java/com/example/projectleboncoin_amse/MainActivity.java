package com.example.projectleboncoin_amse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android. widget. EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button button9;
    Button button10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);

        //Button b = new Button(this);
        //b.setText("Accelerometre");
        //final EditText e = new EditText(this);
        //e.setText("Cliquer pour obtenir les valeurs de l'accelerometre");
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lancementSecondeActivite = new Intent(MainActivity.this, CameraAdAddActivity .class);
                startActivity (lancementSecondeActivite);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lancementSecondeActivite = new Intent(MainActivity.this, AdListViewActivity.class);
                startActivity (lancementSecondeActivite);
            }
        });
    }
}