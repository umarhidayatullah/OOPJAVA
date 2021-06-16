package com;

public class Umar {
    public float pi() {
        float pi = 22/7.0f;
        return pi;
    }
    public double pipi() {
        double  pi = 22/7.0;
        return pi;
    }

    public static void main(String[] args) {
        int a = 5;
        double b = 5.99;
        char c = 'D';
        boolean d = true;
        String e = "Hello";
        System.out.println(a);
        System.out.println(b);

        int f = 5;
        int g = 10;
        System.out.println(f < g);

        Umar mar = new Umar();
        System.out.println(mar.pi());
        System.out.println(mar.pipi());

        int waktu = 12;
        if(waktu < 18) {
            System.out.println("Good Day");
        } else if (waktu > 18) {
            System.out.println("Good Night");
        } else {
            System.out.println("Maaf anda kurang beruntung");
        }
    }
}
