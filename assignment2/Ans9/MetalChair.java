package assignment2.Ans9;

public class MetalChair extends Furniture {
    private String metalType;
    private int legCount;

    public MetalChair(String name, String material, int legs, double stress, double fire ){
        furnitureName = name;
        metalType = material;
        legCount = legs;
        stressValue = stress;
        fireValue = fire;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Metal type: " + metalType);
        System.out.println("Number of legs in chair: " + legCount + "\n");
    }
}

