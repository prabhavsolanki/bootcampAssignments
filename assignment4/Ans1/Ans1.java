package assignment4.Ans1;

// 1. Write Java code to define List.
// Insert 5 floating point numbers in List,
// and using an iterator,
// find the sum of the numbers in List.

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ans1 {

    public static void main(String[] args) {
        Driver driver = new Driver();
        System.out.println("Sum: " + driver.listSum());
    }
}

class Driver {
    List<Float> list = new LinkedList<Float>();

    public Float listSum(){

        // Adding floating numbers to list
        list.add(3.25f);
        list.add(11.05f);
        list.add(36.896f);
        list.add(0.12f);
        list.add(11.13f);

        Iterator<Float> it = list.iterator();
        float sum = 0;

        //Iterating over the list
        while(it.hasNext()){
            sum+=it.next();
        }
        return sum;
    }
}
