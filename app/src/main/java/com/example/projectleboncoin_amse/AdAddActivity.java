package com.example.projectleboncoin_amse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android. widget. EditText;
import android.widget.TextView;
public class AdAddActivity extends AppCompatActivity {

    Button button;
    EditText editText1;
    EditText editText2;
    EditText editText3;

    TextView text_site;
    TextView text_address;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_add);

        button = (Button) findViewById(R.id.button);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
//        editText3 = (EditText) findViewById(R.id.editText3);

        text_site = (TextView) findViewById(R.id.textView5);
        text_address = (TextView) findViewById(R.id.textView1);

        final EditText userText1 = (EditText) findViewById(R.id.editText1);
        final EditText userText2 = (EditText) findViewById(R.id.editText2);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lancementSecondeActivite = new Intent(AdAddActivity.this, AdListViewActivity.class);
                lancementSecondeActivite.putExtra("message1", userText1.getText(). toString ());
                lancementSecondeActivite.putExtra("message2", userText2.getText(). toString ());
                startActivity (lancementSecondeActivite);
            }
        });
    }
}
