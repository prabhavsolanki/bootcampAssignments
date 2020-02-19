package assignment2.Ans1;

public abstract class Person {
    private int id;
    private String name;
    private String address;
    private String phoneNumber;

    public Person(int ID, String fname, String addr, String number){
        id = ID;
        name = fname;
        address = addr;
        phoneNumber = number;
    }

    public String getName() {
        return name;
    }

    public void getInfo(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
    }

}
