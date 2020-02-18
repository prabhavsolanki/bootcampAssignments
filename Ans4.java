package assignment;

import java.util.Scanner;

// Q4. Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String
public class Ans4 {

    void numberAndPercentage(char[] inputString){
        int length = inputString.length;
        int upper, lower, digit, special;
        upper = lower = digit = special = 0;
        for (char c : inputString) {
            if(Character.isUpperCase(c))
                upper++;
            else if(Character.isLowerCase(c))
                lower++;
            else if (Character.isDigit(c))
                digit++;
            else if (Character.isWhitespace(c))
                continue;
            else
                special++;
        }

        System.out.println("Length of string: " + length);
        System.out.println("Number of lowercase letter = " + lower + ", and their percentage = " + (lower*100/length) + "%");
        System.out.println("Number of uppercase letter = " + upper + ", and their percentage = " + (upper*100/length) + "%");
        System.out.println("Number of digits = " + digit + ", and their percentage = " + (digit*100/length) + "%");
        System.out.println("Number of special characters = " + special + ", and their percentage = " + (special*100/length) + "%");

    }


    public static void main(String[] args) {

//        Inputs and driver code
        Scanner scr = new Scanner(System.in);
        System.out.println(" Q4. Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String");
        char[] inputString;
        System.out.print("Enter string: ");
        inputString = scr.nextLine().toCharArray();

//        Object call and method invocation
        Ans4 ans = new Ans4();
        ans.numberAndPercentage(inputString);

    }
}
