package com.jai;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int a = 100;
//        int b = in.nextFloat();
//            this cant to do bcz we are taking integer as input and store in float
//        TypeCasting
        int a = (int) (23.6337f);
        System.out.println(a);

//        Automatic Type Promotion

        byte t = 100;
        byte b = 20;
        int c = t * b;// this will convert byte to integer and it doesnt give error
        System.out.println(c);

        byte f = 23;
//        f = f * 23;//this will show error bcz it cant able to store in byte


        int number = 'a';
        System.out.println(number);
        System.out.println("こんにちは");// we can able to give any lang bcz java follows unicode principles

        byte by = 20;
        int i = 30020;
        short s = 12233;
        float fl = 34.344f;
        double d = 8488488.888838;
        long l = 8288383999L;
        char ch = 'A';

        double dou = (by * f) + (d - l) + (i + ch);
        System.out.println((by * fl) + " " + (d - l) + " " +(i + ch));
        System.out.println(dou);


    }
}
