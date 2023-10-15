/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package question1;
/**
 *
 * @author ashfa
 */
public class Question1Main {

    public static void main(String[] args) {
   
        String n= args[0];
        int num=Integer.parseInt(n);
        int a=2;
        for(int i=0;i<num;i++){
            
            int count = 0;
            
        for(int j = 1; j <= a; j++)
            if(a%j == 0)
                count++;

        if(count == 2)
            System.out.print(a + " ");

        a++;
        }
                }
}
