package assignment2.Ans9;

//  9.  Design classes having attributes for furniture where,
//      there are wooden chairs and tables, metal chairs and tables.
//      There are stress and fire tests for each products.


// Abstract parent class
public abstract class Furniture {
    protected String furnitureName;
    protected double stressValue;
    protected double fireValue;

    public void stressTest(){
        System.out.println(furnitureName + "'s stress test result: " + stressValue );
    }
    public void fireTest(){
        System.out.println(furnitureName + "'s fire test result: " + fireValue);
    }

    public void showDetails(){
        System.out.println("Furniture name: " + furnitureName);
        System.out.println("stress Value: " + stressValue);
        System.out.println("Fire Value: " + fireValue);
    }
}
