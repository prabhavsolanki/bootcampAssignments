package assignment4.Ans5;

// 5. Write a program to sort Employee objects based on highest salary using Comparator.
// Employee class{ Double Age; Double Salary; String Name

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

    // List storing Employee objects
    List<Employee> employees = new ArrayList<>();

    // Method to add employees to list
    public void bulkAdd(){
        employees.add(new Employee(23.0, 15000.0, "Shayan"));
        employees.add(new Employee(22.0, 60000.0, "Rishabh"));
        employees.add(new Employee(23.0, 45000.0, "Ammar"));
        employees.add(new Employee(25.0, 30000.0, "Fahad"));
        employees.add(new Employee(21.0, 50000.0, "Ankur"));
    }

    // Method to sort employee list using custom comparator
    public void employeeSorter(){
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getSalary() < o2.getSalary())
                    return 1;
                else if(o1.getSalary() > o2.getSalary())
                    return -1;
                else
                    return 0;
            }
        });
    }

    // Method for displaying employees
    public void displayEmployees(){
        System.out.println("NAME --- SALARY --- AGE ");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + "   " + employee.getSalary() + "   " + employee.getAge());
        }
    }
}

class Driver {
    public static void main(String[] args) {
        App obj = new App();

        obj.bulkAdd();
        System.out.println("\nBefore sorting:");
        obj.displayEmployees();
        obj.employeeSorter();
        System.out.println("\nAfter sorting by salary:");
        obj.displayEmployees();
    }
}
