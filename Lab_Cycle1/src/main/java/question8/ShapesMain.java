/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question8;

/**
 *
 * @author ashfa
 */
interface Shapes3D {
    void printArea();
    void printVolume();
}
class Cylinder implements Shapes3D{
    private double radius;
    private double height;
    
    public Cylinder(double radius,double height){
        this.radius=radius;
        this.height=height;
    }

    @Override
    public void printArea() {
        double ls_area=2* Math.PI * radius * height;
        double b_area=Math.PI * radius *radius;
        double ts_area=2* b_area + ls_area;
        System.out.println("The Area of the Cylinder: "+ ts_area);
    }
     

    @Override
    public void printVolume() {
        double volume=Math.PI * radius * radius * height;
        System.out.println("The Volume of the Cylinder: "+ volume);
    }
}
class Sphere implements Shapes3D{
    private double radius;
    
    public Sphere(double radius){
        this.radius=radius;
    }

    @Override
    public void printArea() {
        double s_area=4* Math.PI * radius * radius;
        System.out.println("The Area of the Sphere: "+s_area);
    }

    @Override
    public void printVolume() {
        double volume=(4/3)* Math.PI * Math.pow(radius, 3);
        System.out.println("The Volume of the Sphere: "+volume);
        System.out.println("\n\n");
    }   
}

public class ShapesMain{
    public static void main(String[] args) {
        
        double cylinder_radius = 6.0;
        double cylinder_height = 15.0;
        Cylinder cylinder = new Cylinder(cylinder_radius, cylinder_height);
        System.out.println("\n\nCylinder Properties:");
        cylinder.printArea();
        cylinder.printVolume();

        
        double sphere_radius = 7.0;
        Sphere sphere = new Sphere(sphere_radius);
        System.out.println("\nSphere Properties:");
        sphere.printArea();
        sphere.printVolume();
    }
}