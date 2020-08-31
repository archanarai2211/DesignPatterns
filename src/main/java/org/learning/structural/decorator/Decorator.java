package org.learning.structural.decorator;

public class Decorator {
    // Looks like creational pattern, but it is structural
    //You are adding new functionality in each class created

    public static void main(String[] args) {
        Sandwich s = new Sandwich(new VegSandwich(new SpecialVegSandwich("extra cheese")));
        System.out.println(s.getSandwich());
    }
}
