package com.example.projectleboncoin_amse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
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
    }
}