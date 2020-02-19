package assignment2.Ans8;

//  8. WAP to read words from the keyboard until the word done is entered.
//  For each word except done, report whether its first character is equal to its last character.
//  For the required loop, use a :
//     b)do-while statement

import java.util.Scanner;

public class usingDoWhile {
    public String word;

    public usingDoWhile(String currentWord){
        word = currentWord;
    }

    public boolean isDone(){
        return word.equalsIgnoreCase("done");
    }

    public boolean isFormatted(){
        return (word.charAt(word.length()-1) == word.charAt(0));
    }
}

class Driver {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Start entering words...");
        String currentWord = scr.nextLine().trim();

        usingDoWhile obj = new usingDoWhile(currentWord);

        if(obj.isDone())
            System.exit(0);

        do {
            if(obj.isFormatted())
                System.out.println(obj.word + ": First character is equal to the last");
            else
                System.out.println(obj.word + ": First character is NOT equal to the last");
            obj.word = scr.nextLine().trim();
        } while(!obj.isDone());

    }
}
