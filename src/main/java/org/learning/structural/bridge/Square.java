package org.learning.structural.bridge;

public class Square implements Shape {
    Color c;
    public Square(Color c) {
        this.c = c;
    }

    public void getShapeColor() {
        System.out.println(c.getColor()+" Square");
    }
}
