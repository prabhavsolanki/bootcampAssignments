package assignment4.Ans5;

// Employee class
public class Employee {
    private Double Age;
    private Double Salary;
    private String Name;

    public Employee(Double age, Double salary, String name){
        this.Age = age;
        this.Salary = salary;
        this.Name = name;
    }

    // Getters
    public Double getAge() {
        return Age;
    }
    public Double getSalary() {
        return Salary;
    }
    public String getName() {
        return Name;
    }

}
