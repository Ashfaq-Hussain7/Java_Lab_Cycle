/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question8;

/**
 *
 * @author ashfa
 */
public class EXCEPTION {
    public static void main(String[] args) {
        
        int x=45;
        int y=0;
        try{
            System.out.println("\nResult: "+(x/y));
            int a[]=new int[10];
            for(int i=0; i<12; i++){
                a[i]=i+1;
            }
        }
        catch(ArithmeticException Ex){
            System.out.println("\nCheck the value of y!!");
        }
        catch(ArrayIndexOutOfBoundsException Ex){
            System.out.println("\nArray out of Bound!!!");
        }
        finally{
            System.out.println("\n\n***Program executed without any exception!***\n\n");
        }
    }
}


