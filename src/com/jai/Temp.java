package com.jai;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the temp in celcius: ");
        float celcius = in.nextFloat();
        double Farenhiet  = (celcius * 1.8) + 32;
        System.out.println("Temp of Farenheit is:"+ Farenhiet);
    }
}
