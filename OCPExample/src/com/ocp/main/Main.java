package com.ocp.main;

import com.ocp.shape.Circle;
import com.ocp.shape.Rectangle;
import com.ocp.shape.Shape;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);

        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Circle area: " + circle.calculateArea());
    }
}
