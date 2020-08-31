package org.learning.structural.decorator;

public class Sandwich {
    VegSandwich vs;
    public Sandwich(VegSandwich vs) {
        this.vs = vs;
    }

    public String getSandwich(){
        return "Bread: " + vs.getSandwich();
    }
}
