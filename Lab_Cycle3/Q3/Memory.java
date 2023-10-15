/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author nazal
 */
public class Memory {
    public static void main(String[] args) {
        // Get the runtime instance
        Runtime runtime = Runtime.getRuntime();

        // total memory 
        long totalMem = runtime.totalMemory();

        // free memory
        long freeMem = runtime.freeMemory();

        // initial memory usage
        System.out.println("Total Memory: " + totalMem + " bytes");
        System.out.println("Free Memory: " + freeMem + " bytes");

        // Execute garbage collector
        runtime.gc();

        //memory usage after garbage collection
        long memoryAfterGC = runtime.freeMemory();

        // memory usage after garbage collection
        System.out.println("Free Memory after Garbage Collection: " + memoryAfterGC + " bytes");
    }
}
