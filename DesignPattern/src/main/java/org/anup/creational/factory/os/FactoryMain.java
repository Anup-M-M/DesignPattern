package org.anup.creational.factory.os;

public class FactoryMain {
    public static void main(String[] args) {
        OSFactory osf = new OSFactory();
        OS os = osf.getInstance("OPEN");
        os.spec();
    }
}
