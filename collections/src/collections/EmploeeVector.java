package collections;

import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

// Define Employee class
class Employee {
    private int id;
    private String name;

    // Constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // toString method for printing
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name;
    }
}

public class EmploeeVector {
    public static void main(String[] args) {
        // Create a Vector to store Employee objects
        Vector<Employee> employees = new Vector<>();

        // Add Employee objects
        employees.add(new Employee(101, "Alice"));
        employees.add(new Employee(102, "Bob"));
        employees.add(new Employee(103, "Charlie"));

        // Print using Iterator
        System.out.println("Employees (using Iterator):");
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Print using Enumeration
        System.out.println("\nEmployees (using Enumeration):");
        Enumeration<Employee> enumeration = employees.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
