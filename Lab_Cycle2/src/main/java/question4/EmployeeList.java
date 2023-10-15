/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question4;

/**
 *
 * @author ashfa
 */
class Employee {

    Employee() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void getDetails() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void printDetails() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static class DateOfBirth{
        private final int dd,mm,yy;

        public DateOfBirth(int dd, int mm, int yy) {
            this.dd = dd;
            this.mm = mm;
            this.yy = yy;
        }

        @Override
        public String toString() {
            return "\nDate of birth\t=\t"+dd+"\\"+mm+"\\"+yy;
        }
    }

    public static class DateOfJoining{
        private final int dd,mm,yy;

        public DateOfJoining(int dd, int mm, int yy) {
            this.dd = dd;
            this.mm = mm;
            this.yy = yy;
        }

        @Override
        public String toString() {
            return "\nDate of joining\t=\t"+dd+"\\"+mm+"\\"+yy;
        }
    }
    private String name;
    private final String id;
    private final DateOfBirth dob;
    private final DateOfJoining doj;
    private double salary;

    public Employee(String name, String id,
                    DateOfBirth dob, DateOfJoining doj,
                    double salary) {
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.doj = doj;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name\t=\t" + name +
                dob +
                "\nID\t=\t" + id +
                 doj +
                "\nSalary\t=\t" + salary;
    }
}

public class EmployeeList {
    Employee employees[];
    int count;
    
    public EmployeeList(int count){
        this.count = count;
        employees = new Employee[count];
    }
    
    public void getEmployees(){
        for(int i=0;i<count;i++){
            employees[i] = new Employee();
            employees[i].getDetails();
        }
    }
    
    public void sortList(){
        for(int i=1;i<count;i++){
            double key = employees[i].getSalary();
            int j=i-1;
            while(j>=0 && key>employees[j].getSalary()){
                employees[j+1] = employees[j];
            }
            employees[j+1] = employees[i];
        }
    }
    
    public void displaySorted(){
        for(int i=0;i<count;i++){
            employees[i].printDetails();
        }
    }
    
}

