package com.xebia.awesomebakery;


public class BuyRequest {

    private String itemName;
    private int itemQuantity;

    public BuyRequest(String itemName, int itemQuantity) {
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }
}