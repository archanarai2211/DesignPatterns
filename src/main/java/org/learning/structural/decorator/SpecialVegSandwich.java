package org.learning.structural.decorator;

public class SpecialVegSandwich {
    String extra;
    public SpecialVegSandwich(String extra) {
        this.extra = extra;
    }
    public String getSandwich(){
        return (extra);
    }
}
