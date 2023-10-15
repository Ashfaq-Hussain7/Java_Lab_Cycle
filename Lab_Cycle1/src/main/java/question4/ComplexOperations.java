/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question4;

import java.util.*;
/**
 *
 * @author ashfa
 */
class Complex{
    double real,imag;
    public Complex(double real,double imag){
        this.real=real;
        this.imag=imag;
    }
    public void printComplex() {
        System.out.println(real + " + " + imag + "i");
    }

    // Getters and setters (optional)
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imag;
    }

    public void setImaginary(double imag) {
        this.imag = imag;
    }
}

public class ComplexOperations {
    public static Complex add(Complex c1, Complex c2) {
        double realSum = c1.getReal() + c2.getReal();
        double imaginarySum = c1.getImaginary() + c2.getImaginary();
        return new Complex(realSum, imaginarySum);
    }

    public static Complex multiply(Complex c1, Complex c2) {
        double realProduct = c1.getReal() * c2.getReal() - c1.getImaginary() * c2.getImaginary();
        double imaginaryProduct = c1.getReal() * c2.getImaginary() + c1.getImaginary() * c2.getReal();
        return new Complex(realProduct, imaginaryProduct);
    }

    public static double modulus(Complex c) {
        return Math.sqrt(c.getReal() * c.getReal() + c.getImaginary() * c.getImaginary());
    }

    public static void main(String[] args) {
        // Creating two complex numbers
        Complex c1 = new Complex(5,4);
        Complex c2 = new Complex(3,2);

        // Printing the complex numbers
        System.out.println("Complex number 1:");
        c1.printComplex();
        System.out.println("Complex number 2:");
        c2.printComplex();

        // Adding two complex numbers
        Complex sumResult = ComplexOperations.add(c1, c2);
        System.out.println("Sum:");
        sumResult.printComplex();

        // Multiplying two complex numbers
        Complex productResult = ComplexOperations.multiply(c1, c2);
        System.out.println("Product:");
        productResult.printComplex();

        // Calculating modulus of a complex number
        double modulusResultC1 = ComplexOperations.modulus(c1);
        double modulusResultC2 = ComplexOperations.modulus(c2);
        System.out.println("Modulus of c1: " + modulusResultC1);
        System.out.println("Modulus of c2: " + modulusResultC2);
    }
}




