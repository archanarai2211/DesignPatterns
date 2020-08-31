package org.learning.structural.bridge;

public class Circle implements Shape {
    Color c;
    public Circle(Color c) {
        this.c = c;
    }

    public void getShapeColor() {
        System.out.println(c.getColor()+ " Circle");
    }
}
