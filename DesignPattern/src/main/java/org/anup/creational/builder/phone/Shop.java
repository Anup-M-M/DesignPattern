package org.anup.creational.builder.phone;

public class Shop {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setOs("Android").setBattery(4000).getPhone();
        System.out.println(p);
    }
}
