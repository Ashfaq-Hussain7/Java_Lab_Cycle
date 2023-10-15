/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question10;

/**
 *
 * @author ashfa
 */
class ABC {
    int a,b,c;
    ABC(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void print_product(){
        System.out.println("\nProduct: "+a*b*c);        
    }
    public void finalize(){
        System.out.println("\nGarbage Collected!!\n\n");
    }
}
public class ABCMain{
    public static void main(String[] args) {
        ABC ob1=new ABC(3,4,5);
        ABC ob2=new ABC(6,7,8);
        ob1.print_product();
        ob2.print_product();
        ob1=null;
        System.gc();
    }
}
