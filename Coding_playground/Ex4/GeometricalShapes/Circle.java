package Coding_playground.Ex4.GeometricalShapes;

public class Circle {
    private double radius = 3;

    public double getCircumference() {
        double circumference = Math.PI * (2 * this.radius);
        return circumference;
    }

    public double getArea() {
        double area = Math.PI * this.radius * this.radius;
        return area;
    }
}
