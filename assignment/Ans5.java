package assignment;

import java.util.Arrays;
import java.util.HashMap;

//    Q5. Find common elements between two arrays.
public class Ans5 {

    void findCommon(int[] firstArray, int[] secondArray){

        HashMap<Integer, Boolean> common = new HashMap<Integer, Boolean>();

//        Setting firstArray elements in hashmap
        for (int element : firstArray) {
            common.put(element, false);
        }

//        For elements common in hashmap and secondArray, setting value to true in hashmap
        for (int element : secondArray) {
            if(common.containsKey(element))
                common.put(element, true);
        }
        common.forEach((k,v) -> {
            if(v ==  true){
                System.out.print(k + " ");

            }
        });
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
