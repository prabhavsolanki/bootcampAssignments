package assignment;

//Q3. Write a program to find the number of occurrences of a character in a string without using loop?

import java.util.Scanner;

public class Ans3 {
    private String inputString;

//    Setter
    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

//    Occurrence checker
    void numberOfOccurrence(String target){
        System.out.println("Input string: " + inputString);
        System.out.print("Number of occurrences of '" + target + "' is: ");
        System.out.println(inputString.length() - inputString.replace(target,"").length());
    }

    public static void main(String[] args) {
//     Inputs and driver code
        Scanner scr = new Scanner(System.in);
        System.out.println("Q3. Write a program to find the number of occurrences of a character in a string without using loop?");
        System.out.println("Press Y/y for custom input or any other key for default input");
        String choice = scr.nextLine();
        String inputString;
        String target;
        switch (choice){
            case "Y":
            case "y":
                System.out.print("Enter string: ");
                inputString = scr.nextLine();
                System.out.print("Enter character whose occurrence is to be checked: ");
                target = scr.nextLine();
                break;
            default:
                inputString = "Moderation";
                target = "o";
        }

//        Object call and method invocation
        Ans3 ans = new Ans3();
        ans.setInputString(inputString);
        ans.numberOfOccurrence(target);


    }
}
