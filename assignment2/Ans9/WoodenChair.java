package assignment2.Ans9;

public class WoodenChair extends Furniture {
    private String woodType;
    private int legCount;

    public WoodenChair(String name, String material, int legs, double stress, double fire ){
        furnitureName = name;
        woodType = material;
        legCount = legs;
        stressValue = stress;
        fireValue = fire;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Wood type: " + woodType);
        System.out.println("Number of legs in chair: " + legCount + "\n");
    }
}
