package org.anup.structural.composite.computer;

public class CompositeTest {

    public static void main(String[] args) {

        Component hd = new Leaf("HDD", 4000);
        Component mouse = new Leaf("Mouse", 500);
        Component monitor = new Leaf("Monitor", 5000);
        Component ram = new Leaf("Ram", 2000);
        Component cpu = new Leaf("CPU", 9000);

        Composite pp = new Composite("Peripheral");
        Composite cabinet = new Composite("Cabinet");
        Composite mb = new Composite("MotherBoard");
        Composite computer = new Composite("Computer");

        mb.addComponents(cpu);
        mb.addComponents(ram);

        pp.addComponents(mouse);
        pp.addComponents(monitor);

        cabinet.addComponents(hd);
        cabinet.addComponents(mb);

        computer.addComponents(pp);
        computer.addComponents(cabinet);

        computer.showPrice();



    }
}
