package com.example.projectleboncoin_amse;

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
        Button display = findViewById(R.id.button1);
        Button add = findViewById(R.id.constant);
        display.setOnClickListener(new View.OnClickListener(){
            public void onClick(View a){
                Intent advancement = new Intent(MainActivity.this , AdListViewActivity.class );
                startActivity (advancement);
            }
        });
        add.setOnClickListener(new View.OnClickListener(){
            public void onClick(View b){
                Intent advancement = new Intent(MainActivity.this , AdAddActivity.class );
                startActivity (advancement);
            }
        });
    }
}