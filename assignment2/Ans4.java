
//  4. WAP to create singleton class.

package assignment2;

//  Singleton class
public class Ans4 {
    private static Ans4 singleInstance = null;
    String str;

    private Ans4(){
        str = "Hi from compile time";
    }

//    Function to keep track that only single instance runs at a time
    public static Ans4 getInstance(){
        if (singleInstance == null)
            singleInstance = new Ans4();
        return singleInstance;
    }
}

class Ans4Driver {
    public static void main(String[] args) {
        Ans4 signleton1 = Ans4.getInstance();
        Ans4 signleton2 = Ans4.getInstance();

        signleton1.str = "Hi from Singleton1 object";

//        All objects of singleton classes refer to the same object
        System.out.println("String in singleton1 object: " + signleton1.str);
        System.out.println("String in singleton2 object: " + signleton2.str);

        signleton2.str = "hi from singleton2 object";

        System.out.println("String in singleton1 object: " + signleton1.str);
        System.out.println("String in singleton2 object: " + signleton2.str);

    }
}
