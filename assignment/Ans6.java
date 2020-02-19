package assignment;

// Q6. There is an array with every element repeated twice except one. Find that element

import java.util.Arrays;
import java.util.HashMap;

public class Ans6 {

    void findElement(int[] inputArray){
        HashMap<Integer, Integer> unique = new HashMap();
        for (int i : inputArray) {
            if (unique.get(i) == null)
                unique.put(i, 1);
            else
                unique.put(i, unique.get(i)+1);
        }

        unique.forEach((k,v)-> {
            if(v != 2)
                System.out.println("Element repeated once: " + k);
        });

    }

}

class Ans6Driver {
    public static void main(String[] args) {
        int[] inputArray = {1, 1, 2, 2, 5, 5, 7, 13, 13, 56, 56};
        Ans6 ans = new Ans6();
        System.out.println("Input array: " + Arrays.toString(inputArray));
        ans.findElement(inputArray);
    }
}
