/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question3;



/**
 *
 * @author ashfa
 */
import java.util.Scanner;

class Student{
    private String name;
    private int roll_no;
    private int total_marks;
    int marks[]=new int[5];
    public void get_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your roll number: ");   
        roll_no = sc.nextInt();
        System.out.println("Enter your marks for the first subject: ");
        marks[0]=sc.nextInt();
        System.out.println("Enter your marks for the second subject: ");
        marks[1]=sc.nextInt();
        System.out.println("Enter your marks for the third subject: ");
        marks[2]=sc.nextInt();
        System.out.println("Enter your marks for the fourth subject: ");
        marks[3]=sc.nextInt();
        System.out.println("Enter your marks for the fifth subject: ");
        marks[4]=sc.nextInt();
    }
    
    public void total_marks(){
        total_marks = marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
    }
    public int get_total(){
        return total_marks;
    }
    public void print_details(){
        System.out.println("************************");
        System.out.println("\nThe Name of the Student is: "+name);
        System.out.println("\nThe Roll no of the Student is: "+roll_no);
        System.out.println("\nThe Total Marks obtained is: "+get_total());
        System.out.println("\n***********************");
    }
}
public class StudentMain{
    public static void main(String[] args) {
        Student ob1=new Student();
        ob1.get_details();
        ob1.total_marks();
        ob1.get_total();
        System.out.println("The Result of The First Student is: ");
        ob1.print_details();
        Student ob2=new Student();
        ob2.get_details();
        ob2.total_marks();
        ob2.get_total();
        System.out.println("The Result of Second Student is: ");
        ob2.print_details();
        }
}