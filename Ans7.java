package assignment;

// Q7. Write a program to print your Firstname, LastName & age using static block,static method & static variable respectively.

public class Ans7 {
//    static variables
    static String firstName;
    static String lastName;
    static int age;

//    static block
    static{
        firstName = "Shayan";
        lastName = "Nasir";
        age=23;
    }

//    static method
    public static void print(){
        System.out.println("First name: "+" "+firstName);
        System.out.println("Last name:"+" "+lastName);
        System.out.println("Age:"+" "+age);
    }
}

// Driver class
class Ans7Driver {

    public static void main(String[] args) {
        Ans7.print();
    }
}
