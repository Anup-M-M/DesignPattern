package org.anup.structural.composite.computer;

public class Leaf implements Component{

    public String name;
    public int price;

    public Leaf(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println(name + " : "+ price);
    }
}
