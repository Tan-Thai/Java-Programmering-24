package Coding_playground.Ex4.GeometricalShapes;

public class Rectangle {
    private double height = 10;
    private double width = 5;

    public double getArea() {
        double area = this.height * this.width;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * (this.height + this.width);
        return perimeter;
    }
}
