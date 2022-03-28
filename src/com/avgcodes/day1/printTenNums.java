package com.avgcodes.day1;

import java.util.Scanner;

public class printTenNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++) {
            System.out.println(i);
        }
        System.out.println();
        for(int j=num; j>=1; j--)
        {
            System.out.println(j);
        }
    }
}
