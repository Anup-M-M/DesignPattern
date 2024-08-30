package org.anup.structural.composite.computer;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    public String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponents(Component com){
        components.add(com);
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for(Component c : components){
            c.showPrice();
        }
    }
}
