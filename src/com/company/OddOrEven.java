package com.company;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        //accept input and output if odd or even
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();
        String test;
        int nummod;
        nummod = num%2;
        if (nummod==0){
            test = "even";
        }
        else{
            test="odd";
        }
        System.out.println(num+" is "+test);

    }
}
