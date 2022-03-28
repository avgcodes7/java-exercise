package com.avgcodes.day1;

import java.util.Scanner;

public class triangleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle1:");
        int angle1 = sc.nextInt();
        System.out.print("Enter angle2:");
        int angle2 = sc.nextInt();
        System.out.print("Enter angle3:");
        int angle3 = sc.nextInt();

        if((angle1 + angle2 + angle3) == 180){          //Find if sum of the angles are 180 or not
            System.out.println("It's a Triangle!");
        } else{
            System.out.println("Sorry, It's not a Triangle");
        }
    }
}