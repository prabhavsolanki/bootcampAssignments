package assignment2.Ans1;

public class Student extends Person {

    String department;


    public Student(int ID, String name, String address, String number, String dept){
        super(ID, name, address, number);
        department = dept;
    }



    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Department: " + department);
    }

}
