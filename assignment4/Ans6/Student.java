package assignment4.Ans6;

import java.util.Objects;

// Student class
public class Student implements Comparable<Student>{
    private String Name;
    private Double Score;
    private Double Age;

    // Parameterised constructor for adding students to list
    Student(String name, Double score, Double age){
        this.Name = name;
        this.Score = score;
        this.Age = age;
    }

    // Getters
    public String getName() {
        return Name;
    }
    public Double getScore() {
        return Score;
    }
    public Double getAge() {
        return Age;
    }

    // Overriding hashcode and equals to prevent same object conflicts
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(Name, student.Name) &&
                Objects.equals(Score, student.Score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Score);
    }

    // Defining the natural sorting order
    @Override
    public int compareTo(Student student) {
        if (this.Score < student.Score)
            return 1;
        else if(this.Score > student.Score)
            return -1;
        else {
            return this.Name.compareToIgnoreCase(student.Name);
        }
    }
}
