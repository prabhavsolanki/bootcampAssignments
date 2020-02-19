package assignment2;

//11. Convert the following code so that it uses nested while statements instead of for statements:
//    int s = 0;
//    int t = 1;
//    for (int i = 0; i < 10; i++)
//    {
//    s = s + i;
//    for (int j = i; j > 0; j−−)
//    {
//    t = t * (j - i);
//    }
//    s = s * t;
//    System.out.println("T is " + t);
//    }
//    System.out.println("S is " + s);

public class Ans11 {

//    Using for loop (as given in the question)
    public void usingFor(){

        int s = 0;
        int t = 1;
        for (int i = 0; i < 10; i++)
        {
            s = s + i;
            for (int j = i; j > 0; j--)
            {
                t = t * (j - i);
            }
            s = s * t;
            System.out.println("T is " + t);
        }
        System.out.println("S is " + s);

    }

//    Using while loop (answer)
    public void usingWhile(){
        int s = 0, i = 0, t = 1;
        while(i < 10){
            s += i;
            int j = i;
            while (j > 0){
                t = t * ( j - i );
                j--;
            }
            s = s * t;
            System.out.println("T is " + t);
            i++;
        }
        System.out.println("S is " + s);
    }

    public static void main(String[] args) {
        Ans11 ans = new Ans11();
        System.out.println("Output using For loops:");
        ans.usingFor();
        System.out.println("Output using While loops:");
        ans.usingWhile();
    }
}
