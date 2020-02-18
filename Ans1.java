package assignment;

// Q1. Write a program to replace a substring inside a string with other string ?

import java.util.Scanner;

public class Ans1 {
    String inputString = "";

    void replaceString(String pattern, String replacement){

//        Replacement
        String outputString = inputString.replaceAll(pattern, replacement);

//        Displaying result
        System.out.println("\nOriginal String: " + inputString);
        System.out.println("Pattern: " + pattern);
        System.out.println("Replacement: " + replacement);
        System.out.println("Updated String: " + outputString);
    }

    public static void main(String[] args) {

//        Input and Driver code
        Scanner scr = new Scanner(System.in);
        System.out.println("Q1. Write a program to replace a substring inside a string with other string ?");
        System.out.println("Press Y/y for custom input or any other key for default inputs");
        String choice = scr.nextLine();
        String inputString, pattern, replacement;
        switch (choice){
            case "Y":
            case "y":
                System.out.print("Enter main string: ");
                inputString = scr.nextLine();
                System.out.print("Enter pattern to replace: ");
                pattern = scr.nextLine();
                System.out.print("Enter replacement string: ");
                replacement = scr.nextLine();
                break;
            default:
                inputString = "Action Speaks Louder Than Words";
                pattern = "Action";
                replacement = "Work";
        }
        Ans1 ans = new Ans1();
        ans.inputString = inputString;
        ans.replaceString(pattern, replacement);
    }

}
