/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question5;

/**
 *
 * @author ashfa
 */
public class Box {
    private double length;
    private double breadth;
    private double height;
    private double area;
    private double volume;

    // Constructor for cube
    public Box(double s_length) {
        this.length = s_length;
        this.breadth = s_length;
        this.height = s_length;
        calculateArea();
        calculateVolume();
    }

    // Constructor for square prism
    public Box(double s_length, double height) {
        this.length = s_length;
        this.breadth = s_length;
        this.height = height;
        calculateArea();
        calculateVolume();
    }

    // Constructor for rectangular prism
    public Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        calculateArea();
        calculateVolume();
    }

    private void calculateArea() {
        area = 2 * (length * breadth + length * height + breadth * height);
    }

    private void calculateVolume() {
        volume = length * breadth * height;
    }

    public double getArea() {
        return area;
    }

    public double getVolume() {
        return volume;
    }

    public static void main(String[] args) {
        // Creating a cube
        Box cube = new Box(5);
        System.out.println("Cube Area: " + cube.getArea());
        System.out.println("\nCube Volume: " + cube.getVolume());

        // Creating a square prism
        Box square_prism = new Box(4, 6);
        System.out.println("\nSquare Prism Area: " + square_prism.getArea());
        System.out.println("\nSquare Prism Volume: " + square_prism.getVolume());

        // Creating a rectangular prism
        Box rect_prism = new Box(3, 5, 7);
        System.out.println("\nRectangular Prism Area: " + rect_prism.getArea());
        System.out.println("\nRectangular Prism Volume: " + rect_prism.getVolume());
    }
}
