package assignment2.Ans5;

// 5. WAP to show object cloning in java using cloneable and copy constructor both.

// b. Program to show object cloning using copy constructor

public class Student {
    private int studentId;
    private String studentName;
    private String studentDept;

    public Student(int id, String name, String dept){
        studentId = id;
        studentName = name;
        studentDept = dept;
    }

    public Student(Student student){
        this.studentId = student.studentId;
        this.studentName = student.studentName;
        this.studentDept = student.studentDept;
    }

    public void showDetails(){
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("Department: " + studentDept + "\n");
    }

}

class StudentDriver {
    public static void main(String[] args) {
//        Original student object
        Student student = new Student(1, "Shayan", "CSE");
        System.out.println("Original student object:");
        student.showDetails();

//        Cloned object
        Student clone = new Student(student);
        System.out.println("Cloned Object:");
        clone.showDetails();

    }
}
