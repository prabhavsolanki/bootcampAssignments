package assignment;

// Q2. Write a program to find the number of occurrences of the duplicate words in a string and print them ?

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ans2 {
    String inputString;

    public Ans2(String inputString){
        this.inputString = inputString;
    }

    void countDuplicates(){
//        String to words
        String[] words = inputString.split(" ");
        Map<String, Integer> occurence = new HashMap<>();

//        Mapping frequency of words
        for (String word : words) {
            if(occurence.get(word) == null)
                occurence.put(word, 1);
            else
                occurence.put(word, occurence.get(word) + 2);
        }

//        Displaying words with frequency greater than 1
        System.out.println("Original string: " + inputString);
        System.out.println("Duplicate words with their frequencies: ");
        occurence.forEach((k,v) -> {
            if(v>1){
                System.out.println(k + ": " + v);
            }
        });
    }


    public static void main(String[] args) {

//        Inputs and driver code
        Scanner scr = new Scanner(System.in);
        System.out.println("Q2. Write a program to find the number of occurrences of the duplicate words in a string and print them ?");
        System.out.println("Press Y/y for custom input or any other key for default input");
        String choice = scr.nextLine();
        String inputString;
        switch (choice){
            case "Y":
            case "y":
                System.out.print("Enter string: ");
                inputString = scr.nextLine();
                break;
            default:
                inputString = "James while John had had had had had had had had had had had a better effect on the teacher";
        }

//        Object creation and method invocation
        Ans2 ans = new Ans2(inputString);
        ans.countDuplicates();

    }

}
