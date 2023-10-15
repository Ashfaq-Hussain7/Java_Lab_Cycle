/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question9;

/**
 *
 * @author ashfa
 */
interface Salary {
    double calculateSalary(double basic_pay);
}

class Employee {
    private String name;
    private int code;
    double basic_pay;

    public Employee(String name, int code, double basic_pay) {
        this.name = name;
        this.code = code;
        this.basic_pay = basic_pay;
    }

    public void printInfo() {
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Employee Code: " + code);
        System.out.println("Basic Pay: " + basic_pay);
    }
}

class SalarySlip extends Employee implements Salary {
    private double deductions;
    private double allowances;

    public SalarySlip(String name, int code, double basic_pay, double deductions, double allowances) {
        super(name, code, basic_pay);
        this.deductions = deductions;
        this.allowances = allowances;
    }

    @Override
    public double calculateSalary(double basic_pay) {
        return basic_pay + allowances - deductions;
    }
    
    public void printSalarySlip() {
        double netSalary = calculateSalary(basic_pay);

        System.out.println("\nSalary Slip");
        System.out.println("------------------");
        printInfo();
        System.out.println("Allowances: " + allowances);
        System.out.println("Deductions: " + deductions);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("------------------\n\n");
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        // Creating an employee
        Employee emp = new Employee("Danish Zakariya", 1100, 50000);
        emp.printInfo();

        // Creating a salary slip for the employee
        SalarySlip salarySlip = new SalarySlip("Fazal Iqbal", 1101, 60000, 5000, 8000);
        salarySlip.printSalarySlip();
    }
}
