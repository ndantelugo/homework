package com.company;

public class Invoice {
    String partNum;
    String partDesc;
    int itemQuantity;
    double itemPrice;

    // constructor is a list of instructions requested every
    // time class is created
    public Invoice(String partNum, String partDesc, int itemQuantity,
                   double itemPrice) {

        this.partNum = partNum;
        this.partDesc = partDesc;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }

    public String getPartNum() {
        return this.partNum;
    }

    public String getPartDesc() {
        return this.partDesc;
    }

    public int getItemQuantity() {
        return this.itemQuantity;
    }

    public double getItemPrice() {
        return this.itemPrice;
    }
}
