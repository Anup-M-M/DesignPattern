package org.anup.creational.builder.phone;

// construct a complex object from simple objects using step-by-step approach
// mostly used when object can't be created in single step like in the de-serialization of a complex object.
// used when class has a lot of attribute and need to maintain order, certain mandatory or optional
public class PhoneBuilder {

    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone(){
        return new Phone(os,ram,processor,screenSize, battery);
    }
}
