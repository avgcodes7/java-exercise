/*
Purpose of this exercise is to just understand the concepts of
encapsulation and creating methods inside a class.

Dummy methods are created for this purpose.

*/

package com.avgcodes.day3.onlineShopping;

public class OnlineShoppingRun {
    public static void main(String[] args) {

        OnlineShopping avgcodes = new OnlineShopping("avgcodes", "Panvel East");
        OnlineShopping avgcodes7 = new OnlineShopping("avgcodes7", "Asalpha East");

        avgcodes7.login();
        avgcodes7.addItem();

        avgcodes.login();
        avgcodes.addItem();

        avgcodes7.removeItem();

        avgcodes7.logout();
        avgcodes.logout();

    }
}
