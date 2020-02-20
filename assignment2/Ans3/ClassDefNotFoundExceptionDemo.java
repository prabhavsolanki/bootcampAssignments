package assignment2.Ans3;

//  3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.


public class ClassDefNotFoundExceptionDemo {

    public static void main(String[] args) {
        try {
            // The following line would throw ExceptionInInitializerError
            SimpleMathError calculator1 = new SimpleMathError();
        } catch (Throwable t) {
            System.out.println(t);
        }
        // The following line would cause NoClassDefFoundError
        SimpleMathError calculator2 = new SimpleMathError();

    }
}

class SimpleMathError {
    static int a = 1/0;
}