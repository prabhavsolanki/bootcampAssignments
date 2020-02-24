package assignment4.Ans6;

// 6. Write a program to sort the Student objects based on Score ,
// if the score are same then sort on First Name .
// Class Student{ String Name; Double Score; Double Age

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class App {
    // List storing Student objects
    List<Student> students = new ArrayList<>();

    // Method for adding student objects to list
    public void bulkAdd(){
        students.add(new Student("Yasan", 94.1, 21.5));
        students.add(new Student("Shayan", 94.1, 23.0));
        students.add(new Student("Zakwan", 91.0, 22.5));
        students.add(new Student("Nasir", 93.5, 22.0));
    }

    // Sorting students in 'natural' order
    public void studentSorter(){
        Collections.sort(students);
    }

    // Displaying students list
    public void displayStudents(){
        System.out.println("NAME ---- SCORE ---- AGE");
        for (Student student : students) {
            System.out.println(student.getName() + "   " + student.getScore() + "   " + student.getAge());
        }
    }
}

// Creating class object and invoking methods
class Driver {
    public static void main(String[] args) {
        App app = new App();

        app.bulkAdd();
        System.out.println("\nBefore sorting:");
        app.displayStudents();
        app.studentSorter();
        System.out.println("\nAfter sorting (by score and name):");
        app.displayStudents();
    }
}
