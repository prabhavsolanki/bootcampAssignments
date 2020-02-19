package assignment2.Ans5;

// 5. WAP to show object cloning in java using cloneable and copy constructor both.

// a. Program to show object cloning using CLONEABLE interface.

public class Employee implements Cloneable {
    private int id;
    private String employeeName;
    private String competency;

    public Employee(int ID, String name, String comp){
        id = ID;
        employeeName = name;
        competency = comp;
    }

    public void showDetails(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + employeeName);
        System.out.println("Competency: " + competency + "\n");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class driver {
    public static void main(String[] args) throws CloneNotSupportedException{

//        Original object
        Employee employeeOne = new Employee(1, "Shayan", "AMC");
        System.out.println("Original object:");
        employeeOne.showDetails();

//        Cloned object
        Employee clone = (Employee) employeeOne.clone();
        System.out.println("Cloned object:");
        clone.showDetails();

    }
}
