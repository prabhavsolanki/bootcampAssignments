package assignment;

// Q6. There is an array with every element repeated twice except one. Find that element

import java.util.Arrays;
import java.util.HashMap;

public class Ans6 {

    int findElement(int[] inputArray){

        int res = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            res = res ^ inputArray[i];
        }
        return res;

    }

}

class Ans6Driver {
    public static void main(String[] args) {
        int[] inputArray = {1, 1, 2, 2, 5, 5, 7, 13, 13, 56, 56};
        Ans6 ans = new Ans6();
        System.out.println("Input array: " + Arrays.toString(inputArray));
        System.out.println("Element repeated only once: " + ans.findElement(inputArray));
    }
}
