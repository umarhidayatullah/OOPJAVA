package com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class juaracoding {
    public boolean valid(String kata) {
        String regex = "^[a-zA-Z]+$";
        Pattern pola = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        return pola.matcher(kata).find();
    }
    public boolean validi(String kata) {
        String regex = "^\\S+@\\S+\\.\\S+$";
        Pattern pola = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        return pola.matcher(kata).find();
    }

    public String input(String kata) {
        Scanner scan = new Scanner(System.in);
        System.out.println(kata);
        return scan.next();
    }
    public static void main(String[] args) {
        System.out.println("Hello world");
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan jumdat :");
        int x = scan.nextInt();
        String[][] data = new String[x][3];

        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < 3; j++) {
                if(j == 0) {
                    System.out.print("Input nama :");
                    data[i][j] = scan.next();
                } else if (j == 1) {
                    System.out.print("Input nim :");
                    data[i][j] = scan.next();
                } else {
                    System.out.print("Input grade :");
                    data[i][j] = scan.next();
                }
            }
            System.out.println();
        }

        for(int a = 0; a < data.length; a++) {
            for(int b = 0; b < data[a].length; b++) {
                if(b == 0) {
                    System.out.println("Nama : "+data[a][b]);
                } else if(b == 1) {
                    System.out.println("NIM :"+data[a][b]);
                } else {
                    System.out.println("Grade :" + data[a][b]);
                }
            }
            System.out.println();
        }

        juaracoding dumbways = new juaracoding();
        String nama = dumbways.input("NAMA ANDA : ");
        while(!dumbways.valid(nama)) {
            System.out.println(" Tidak sesuai format");
            nama = dumbways.input("NAMA ANDA : ");
        }

        String mail = dumbways.input("EMAIL ANDA : ");
        while(!dumbways.validi(mail)) {
            System.out.println(" Tidak sesuai format");
            mail = dumbways.input("EMAIL ANDA : ");
        }

        System.out.println("");
        System.out.println("+++++++++++++");
        System.out.println();
        System.out.println("Nama : "+ nama);
        System.out.println("Email : "+ mail);
        System.out.println();
        System.out.println("-----------------");
    }
}
