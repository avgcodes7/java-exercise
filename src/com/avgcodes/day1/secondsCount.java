package com.avgcodes.day1;

import java.util.Scanner;

public class secondsCount {

    public static int total_sec(int day) {
        return day*24*60*60;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt() ;
        System.out.print(total_sec(day));
    }
}
