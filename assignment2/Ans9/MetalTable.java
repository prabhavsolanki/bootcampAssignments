package assignment2.Ans9;

public class MetalTable extends Furniture {
    private String metalType;
    private int numberOfSeats;

    public MetalTable(String name, String material, int seats, double stress, double fire ) {
        furnitureName = name;
        metalType = material;
        numberOfSeats = seats;
        stressValue = stress;
        fireValue = fire;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Metal type: " + metalType);
        System.out.println("Seats it can accommodate: " + numberOfSeats + "\n");
    }
}
