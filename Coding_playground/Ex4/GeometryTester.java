package Coding_playground.Ex4;

import Coding_playground.Ex4.GeometricalShapes.Circle;
import Coding_playground.Ex4.GeometricalShapes.Rectangle;

public class GeometryTester {
    public static void main(String[] args) {
        
        Circle circle = new Circle();
        System.out.printf("\n%,.2f", circle.getCircumference());
        System.out.printf("\n%,.2f", circle.getArea());

        Rectangle rectangle = new Rectangle();
        System.out.printf("\n%,.2f", rectangle.getPerimeter());
        System.out.printf("\n%,.2f", rectangle.getArea());

        
    }
}
