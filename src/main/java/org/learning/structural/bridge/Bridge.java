package org.learning.structural.bridge;

public class Bridge {

    public static void main(String[] args){
        // For new implementations
        //Keeps abstractions between classes for reusability

        Color green = new Color("green");

        Color blue = new Color("blue");

        Color red = new Color("red");

        Shape circle = new Circle(red);

        circle.getShapeColor();

    }
}
