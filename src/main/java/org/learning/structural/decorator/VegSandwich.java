package org.learning.structural.decorator;

public class VegSandwich {
    SpecialVegSandwich svs;
    public VegSandwich(SpecialVegSandwich svs) {
        this.svs = svs;
    }

    public String getSandwich(){
        return ("Vegetables: "+ svs.getSandwich());
    }
}
