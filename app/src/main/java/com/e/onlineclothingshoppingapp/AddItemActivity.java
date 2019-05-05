package com.e.onlineclothingshoppingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;
import java.io.PrintStream;

public class AddItemActivity extends AppCompatActivity {
    private Button btnAddItem,btnback;
    private EditText etItemName,etitemPrice,etImageName,etItemDesc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);
        btnAddItem=findViewById(R.id.btnAddItem);
        btnback=findViewById(R.id.btnBack);
        etItemName=findViewById(R.id.etItemName);
        etitemPrice=findViewById(R.id.etItemPrice);
        btnback=findViewById(R.id.btnBack);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AddItemActivity.this,DahboardActivity.class);
                startActivity(intent);

            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveItem();
            }
        });


    }
    private void SaveItem(){
        String itemname="itemname";
        String itemprice="itemprice";
        String itemimage="itemimage";
        String itemdesc="itemdesc";
        try{
            PrintStream printStream=new PrintStream(openFileOutput("item.txt",MODE_PRIVATE|MODE_APPEND));
            printStream.println(etImageName.getText().toString()+"->"+etitemPrice.getText().toString()+"+>"+etImageName+"->"+etItemDesc.getText().toString());
            Toast.makeText(this,"Saved to"+getFilesDir(),Toast.LENGTH_SHORT).show();
        }catch (IOException e){
            Log.d("Online Clothing App","Error:"+e.toString());
        }
    }
}
