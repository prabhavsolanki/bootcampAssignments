package assignment2.Ans1;

public class Librarian extends Person {

    Double salary;

    public Librarian(int ID, String name, String address, String number, double sal){
        super(ID, name, address, number);
        salary = sal;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Salary: " + salary);
    }
}
