package com.jai;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = input.next();
        System.out.println("The name is:"+ name);
    }
}
