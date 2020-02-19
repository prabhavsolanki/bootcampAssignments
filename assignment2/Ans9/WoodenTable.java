package assignment2.Ans9;

public class WoodenTable extends Furniture {
    private String woodType;
    private int numberOfSeats;

    public WoodenTable(String name, String material, int seats, double stress, double fire ){
        furnitureName = name;
        woodType = material;
        numberOfSeats = seats;
        stressValue = stress;
        fireValue = fire;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Wood type: " + woodType);
        System.out.println("Seats it can accommodate: " + numberOfSeats + "\n");
    }

}
