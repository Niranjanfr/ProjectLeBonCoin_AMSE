package com.example.projectleboncoin_amse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdListViewActivity extends AppCompatActivity {


    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_list_view);
        Intent i = getIntent();
        Bundle extras = i.getExtras();
        ArrayList<AdModel> ad_list = new ArrayList<AdModel>();



        if (extras != null){
            String titre = i.getStringExtra("Title");
            String address = i.getStringExtra("address");
            String price = i.getStringExtra("price");
            int imageResourceId = getIntent().getIntExtra("image", 0);
            ad_list.add(new AdModel(titre, address, imageResourceId,price));
        }

        ad_list.add(new AdModel("wood", "263 rue du grand bail", R.drawable.wood,"300.000€"));
        ad_list.add(new AdModel("steel", "263 rue du grand bail", R.drawable.steel,"255.000€"));
        ListView listView = findViewById(R.id.listview);
        AdAdapter AdAdapter = new AdAdapter(this, ad_list);
        listView.setAdapter(AdAdapter);

        boolean isRedValue = MainActivity.isMyBoolean();
        if (isRedValue) {
            // If isRedValue is true, set background color to soft yellow
            int softYellow = Color.rgb(250, 252, 203);
            findViewById(android.R.id.content).setBackgroundColor(softYellow);
        } else {
            // Otherwise, set background color to a different color
            // Here, I'm assuming you want to use the soft yellow color defined in resources
            findViewById(android.R.id.content).setBackgroundColor(Color.WHITE);
        }






    }
}
