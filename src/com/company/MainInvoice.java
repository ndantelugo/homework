package com.company;

public class MainInvoice {

    public static void main(String[] args) {
        // write your code here
        System.out.println("code started");

        Invoice invoice = new Invoice("32", "lawnmower", 7, 350.00);

        System.out.println("invoice instantiated");

        System.out.println("the part number is " + invoice.getPartNum());
        System.out.println("the part description is " + invoice.getPartDesc());
        System.out.println("the quantity is " + invoice.getItemQuantity());
        System.out.println("the price is " + invoice.getItemPrice());



    }
}
