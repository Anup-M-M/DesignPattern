package org.anup.creational.factory.plan;

//  define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate.
//  In other words, subclasses are responsible to create the instance of the class.

abstract class Plan{
    protected double rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}