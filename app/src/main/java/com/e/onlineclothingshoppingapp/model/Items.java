package com.e.onlineclothingshoppingapp.model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.e.onlineclothingshoppingapp.R;

public class Items {

    String itemName,itemPrice,itemDesc;
    String itemImage;
    public Items(){}

    public Items(String itemName, String itemPrice, String itemDesc, String itemImage) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDesc = itemDesc;
        this.itemImage = itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }
}
