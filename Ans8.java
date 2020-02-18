package assignment;

// Q8. Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer

public class Ans8 {
    String inputString;

//    Setter
    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    void reverseAndSlice(){
        StringBuilder reversedString = new StringBuilder(inputString);
        reversedString = reversedString.reverse();
        System.out.println("Reversed String: " + reversedString);
        reversedString = reversedString.delete(4, 9);
        System.out.println("After removing character from index 4 to 9: " + reversedString);
    }

}

//Driver class
class Ans8Driver {

    public static void main(String[] args) {
        String str="0123456789";
        System.out.println("Main string: " + str);

//        Object creation and method invocation
        Ans8 ans = new Ans8();
        ans.setInputString(str);
        ans.reverseAndSlice();
    }
}
