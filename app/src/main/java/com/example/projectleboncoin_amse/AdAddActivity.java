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

    TextView text_site;
    TextView text_address;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_add);

        button = (Button) findViewById(R.id.button);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);

        text_site = (TextView) findViewById(R.id.textView5);
        text_address = (TextView) findViewById(R.id.textView1);

        String userText1 = editText1.getText().toString();
        String userText2 = editText2.getText().toString();


        //Button b = new Button(this);
        //b.setText("Accelerometre");
        //final EditText e = new EditText(this);
        //e.setText("Cliquer pour obtenir les valeurs de l'accelerometre");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lancementSecondeActivite = new Intent(AdAddActivity.this, AdListViewActivity.class);
                startActivity (lancementSecondeActivite);
            }
        });
    }
}