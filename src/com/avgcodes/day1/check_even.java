package com.avgcodes.day1;

import java.util.Scanner;

public class check_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0) {                        //To check if number is even or not
            System.out.println(num + " is an even number");
        } else {
            System.out.println((num + " is an odd number"));
        }
    }
}