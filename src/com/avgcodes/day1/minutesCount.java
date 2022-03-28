package com.avgcodes.day1;

import java.util.Scanner;

public class minutesCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_Mins = 0;
        int day = sc.nextInt();
        total_Mins = day * 24 * 60;     //Calculate total minutes in 24 hour
        if(day == 1) {
            System.out.println("Total minutes in " + day + " day is" + total_Mins);
        }
        else {
            System.out.println("Total minutes in " + day + " days is" + total_Mins);
        }
    }
}
