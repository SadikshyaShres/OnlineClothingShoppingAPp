package com.e.onlineclothingshoppingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    TextView itemName, itemPrice, itemImg,itemDesc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        itemName=findViewById(R.id.itemName);
        itemPrice=findViewById(R.id.itemPrice);
        itemImg=findViewById(R.id.itemImg);
        itemDesc=findViewById(R.id.itemDesc);

        Bundle bundle=getIntent().getExtras();
        if (bundle!=null){
            itemName.setText(bundle.getString("itemname"));
            itemPrice.setText(bundle.getString("itemprice"));
            itemImg.setText(bundle.getString("itemimage"));
            itemDesc.setText(bundle.getString("itemdesc"));

        }
    }
}
