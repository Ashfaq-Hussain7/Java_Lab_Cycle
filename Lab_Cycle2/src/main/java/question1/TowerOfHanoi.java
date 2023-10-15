/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package question1;

/**
 *
 * @author ashfa
 */
public class TowerOfHanoi {

    public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("\nMove disk 1 from " + source + " to " + destination);
            return;
        }

        towerOfHanoi(n - 1, source, destination, auxiliary);
        System.out.println("\nMove disk " + n + " from " + source + " to " + destination);
        towerOfHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int numberOfDisks = 3; // You can change the number of disks as needed

        System.out.println("\n\nTower of Hanoi Steps:\n\n");
        towerOfHanoi(numberOfDisks, 'A', 'B', 'C');
    }
}
