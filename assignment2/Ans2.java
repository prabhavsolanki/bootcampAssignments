package assignment2;

// 2. WAP to sort string without using string Methods?.

import java.util.Arrays;
import java.util.Scanner;

public class Ans2 {
    private String inputString;

//    Setter
    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public void sortString(){
        inputString = inputString.toLowerCase();
        int[] alphabets = new int[26];
        Arrays.fill(alphabets, 0);
        char[] charArray = inputString.toCharArray();

        for (char c : charArray) {
            int index = c - 97;
            if (index <0)
                continue;
            alphabets[index]++;
        }
        char intToChar;
        for (int i=0; i<alphabets.length; i++) {
            while (alphabets[i] > 0){
                intToChar = (char)(i+97);
                System.out.print(intToChar);
                alphabets[i]--;
            }
        }

    }
}

//  Driver class
class Ans2Driver {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String inputString;
        System.out.println("2. WAP to sort a string without using string Methods?.");
        System.out.println("Press Y/y for custom input or any other key for default input");
        String choice = scr.nextLine();
        switch (choice){
            case "Y":
            case "y":
                System.out.print("Enter string: ");
                inputString = scr.nextLine();
                break;
            default:
                inputString = "syedshayannasir";
        }

        Ans2 ans = new Ans2();
        ans.setInputString(inputString);
        ans.sortString();

    }
}

