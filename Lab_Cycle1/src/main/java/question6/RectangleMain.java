/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question6;

/**
 *
 * @author ashfa
 */
class Rectangle {
    protected double length;
    protected double breadth;
    protected double area;
    
    public Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }
            
    public void find_area(){
        area=length*breadth;
    }
    public double get_area(){
        return area;
    }
}
class Box extends Rectangle{
    private double height;
    private double volume;
    
    public Box(double length, double breadth, double height){
        super(length,breadth);
        this.height=height;
    }
    public void find_volume(){
        volume=length*breadth*height;
    }
    public double get_volume(){
        return volume;
    }
}
public class RectangleMain{
    public static void main(String[] args) {
        Rectangle rect=new Rectangle(6,10);
        rect.find_area();
        System.out.println("\nThe Area of the Rectangle: "+rect.get_area());
        
        Box box=new Box(3,10,5);
        box.find_area();
        box.find_volume();
        System.out.println("\nThe Area of the Box: "+box.get_area());
        System.out.println("\nThe Volume of the Box: "+box.get_volume());
        System.out.println("\n\n");
    }
}