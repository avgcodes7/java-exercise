package com.avgcodes.day1;

import java.util.Scanner;

public class Multiply {

    public static int Multiply_two_nums(int a, int b) {
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Multiply_two_nums(a,b));
    }
}