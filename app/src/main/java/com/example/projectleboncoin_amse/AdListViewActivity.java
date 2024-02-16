package com.example.projectleboncoin_amse;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.TextView;

public class AdListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_list_view);
        TextView a = (TextView) findViewById(R.id.textView1);
        Button woodButton = findViewById(R.id.woodButton);
        Button cementButton = findViewById(R.id.cementButton);
        Button bricksButton = findViewById(R.id.bricksButton);
        woodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 当wood按钮被点击时执行的操作
            }
        });

        cementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 当cement按钮被点击时执行的操作
            }
        });

        bricksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 当bricks按钮被点击时执行的操作
            }
        });
    }
}
