package assignment2.Ans3;

//  3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.


public class ClassDefNotFoundExceptionDemo {

    public static void main(String[] args) {
        try {
            // The following line would throw ExceptionInInitializerError
            simpleMathError calculator1 = new simpleMathError();
        } catch (Throwable t) {
            System.out.println(t);
        }
        // The following line would cause NoClassDefFoundError
        simpleMathError calculator2 = new simpleMathError();

    }
}

class simpleMathError {
    static int a = 1/0;
}