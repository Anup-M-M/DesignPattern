package org.anup.creational.factory.os;

public class OSFactory {

    public OS getInstance(String osType){
        if(osType.equals("OPEN"))
            return new Android();
        else if (osType.equals("CLOSE"))
            return new IOS();
        else
            return new Windows();
    }
}
