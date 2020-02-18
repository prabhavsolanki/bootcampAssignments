package assignment;

// Q10. Write a single program for following operation using overloading
//  A) Adding 2 integer number
//  B) Adding 2 double
//  C) multiplying 2 float
//  D) multiplying 2 int
//  E) concat 2 string
//  F) Concat 3 String

public class Ans10 {

    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }

    float multiply(float a, float b){
        return a*b;
    }

    int multiply(int a, int b){
        return a*b;
    }

    String concatString(String s1, String s2){
        return s1 + " " + s2;
    }

    String concatString(String s1, String s2, String s3){
        return s1 + " " + s2 + " " + s3;
    }

}

class Ans10Driver {
    public static void main(String[] args) {
        Ans10 ans = new Ans10();

        System.out.println("Sum of two Integers: " + ans.add(2, 3));
        System.out.println("Sum of two Double numbers: " + ans.add(2.67, 3.54));
        System.out.println("Product of two Floats: " + ans.multiply(2.673f, 3.542f));
        System.out.println("Product of two Integers: " + ans.multiply(26, 39));
        System.out.println("Concatenation of TWO strings: " + ans.concatString("Shayan", "Nasir"));
        System.out.println("Concatenation of THREE strings: " + ans.concatString("Syed", "Shayan", "Nasir"));

    }
}
