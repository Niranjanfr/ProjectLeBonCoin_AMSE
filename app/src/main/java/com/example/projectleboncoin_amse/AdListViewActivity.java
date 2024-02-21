package com.example.projectleboncoin_amse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
            //int price = i.getIntExtra("price");
            int imageResourceId = getIntent().getIntExtra("image", 0);
            ad_list.add(new AdModel(titre, address, imageResourceId,10));
        }

        ad_list.add(new AdModel("Title1", "Address1", R.drawable.ic_launcher_background,10));
        ad_list.add(new AdModel("Title2", "Address2", R.drawable.ic_launcher_background,10));
        ListView listView = findViewById(R.id.listview);
        AdAdapter AdAdapter = new AdAdapter(this, ad_list);
        listView.setAdapter(AdAdapter);



    }
}
