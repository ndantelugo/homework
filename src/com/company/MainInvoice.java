package com.company;

import java.util.Scanner;

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


        //set part number with user input
        System.out.println("What is the new part number?");
        Scanner input = new Scanner(System.in);
        invoice.setPartNum(input.next());

        //set part desc with user input
        System.out.println("What is the new part description?");
        invoice.setPartDesc(input.next());

        //set item quantity with user input
        System.out.println("What is the new item quantity?");
        invoice.setItemQuantity(input.nextInt());

        //set item price with user input
        System.out.println("What is the new item price?");
        invoice.setItemPrice(input.nextDouble());

        System.out.println("the part number is "+ invoice.getPartNum() + "\r\nthe part description is " + invoice.getPartDesc() +
                "\r\nthe item quantity is " + invoice.getItemQuantity() + "\r\nthe item price is " + invoice.getItemPrice());
    }
}
