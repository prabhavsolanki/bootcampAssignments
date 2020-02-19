package assignment2.Ans3;

//  3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.


public class ClassNotFoundExceptionDemo {

    private static final String customClassName = "main.java.shayan";

    public static void main(String[] args) {
        try {
//            The following line would throw a ClassNotFoundException
            Class loadClass = Class.forName(customClassName);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
