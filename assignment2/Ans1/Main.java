package assignment2.Ans1;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        Book book1 = new Book(1, "Thousand splendid suns", "Khaled Hussaini", false);

        Librarian lib1 = new Librarian(1, "Fahad Khan", "18-A Chowk, Lucknow", "9685784596", 15000);

        Student s1 = new Student(2, "Shayan", "Aminabad, Lucknow", "7860725663", "CSE");

        String choice;

        while(true){
            System.out.println("\n-----------------------------------");
            System.out.println("Choose an option: ");
            System.out.println("1. View all books");
            System.out.println("2. View all students");
            System.out.println("3. View librarian info");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("Press any other key to exit");
            System.out.println("-----------------------------------\n");

            choice = scr.nextLine();

            switch (choice){
                case "1":
                    book1.getInfo();
                    break;
                case "2":
                    s1.getInfo();
                    break;
                case "3":
                    lib1.getInfo();
                    break;
                case "4":
                    book1.issueBook(s1.getName());
                    break;
                case "5":book1.returnBook();
                    break;
                default: System.exit(0);

            }

        }




    }

}
