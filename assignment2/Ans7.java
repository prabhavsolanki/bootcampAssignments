package assignment2;

import java.util.Scanner;

//  7. WAP to convert seconds into days, hours, minutes and seconds.

public class Ans7 {
    private int seconds;

//    Setter
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void secondsToAll(){
        int n = seconds;
        int day = n/(24 * 3600);
        n = n % (24 * 3600);

        int hour = n/(3600);
        n = n % 3600;

        int minute = n/60;
        n = n % 60;

        int sec = n;

        System.out.print(seconds + " seconds are equivalent to " + day + " days, ");
        System.out.print(hour + " hours, " + minute + " minutes and " + sec + " seconds.");
    }
}

class Ans7Driver {
    public static void main(String[] args) {

//        Fetching input
        Scanner scr = new Scanner(System.in);
        System.out.println("7. WAP to convert seconds into days, hours, minutes and seconds.");
        System.out.println("Press Y/y for custom input or any other key for default inputs");
        String choice = scr.nextLine();
        int seconds;
        switch (choice){
            case "Y":
            case "y":
                System.out.print("Enter seconds: ");
                seconds = scr.nextInt();
                break;
            default:
                seconds = 123456;
        }

//      Object creation and method invocation
        Ans7 ans = new Ans7();
        ans.setSeconds(seconds);
        ans.secondsToAll();
    }
}
