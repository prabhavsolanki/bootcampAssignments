package assignment;

import java.util.Arrays;

//    Q5. Find common elements between two arrays.
public class Ans5 {

    void findCommon(int[] firstArray, int[] secondArray){
        for(int i = 0; i < firstArray.length; i++){
            for(int j = 0; j < secondArray.length; j++){
                if(firstArray[i] == secondArray[j]){
                    System.out.print(firstArray[i] + " ");
                    break;
                }
            }
        }
    }
}

class Ans5Driver {
    public static void main(String[] args) {
        int[] firstArray = {1, 4, 5, 29, 65, 15, 9, 78};
        int[] secondArray = {6, 1, 8, 34, 5, 32, 23, 29};
        System.out.println("Array 1: " + Arrays.toString(firstArray));
        System.out.println("Array 2: " + Arrays.toString(secondArray));
        System.out.print("Common elements are: ");

        Ans5 ans = new Ans5();
        ans.findCommon(firstArray, secondArray);
    }
}
