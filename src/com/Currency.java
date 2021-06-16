package com;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currency {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        double payment = scan.nextDouble();
        scan.close();

        NumberFormat of = NumberFormat.getInstance();
        String us = of.getCurrencyInstance(Locale.JAPAN).format(payment);
        String india = of.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        System.out.println("US "+us);
        System.out.println("India :"+india);



    }
}
