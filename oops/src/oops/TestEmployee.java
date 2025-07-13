package oops;
import java.util.*;

class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    private double annualSalary;
    private int yearStarted;
    private String nationalInsuranceNumber;

   
    public Employee(String name, double annualSalary, int yearStarted, String nationalInsuranceNumber) {
        super(name); 
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

   
    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

   
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public void displayEmployeeDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Year Started: " + yearStarted);
        System.out.println("National Insurance Number: " + nationalInsuranceNumber);
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        
        Employee emp = new Employee("Alice Johnson", 60000.0, 2018, "NI123456A");
        System.out.println("Employee Details:");
        emp.displayEmployeeDetails();
        emp.setAnnualSalary(65000.0);
        emp.setYearStarted(2019);
        System.out.println("\nUpdated Employee Details:");
        emp.displayEmployeeDetails();
    }
}

