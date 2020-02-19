package assignment2.Ans9;


// Main driver class
public class Driver {
    public static void main(String[] args) {
        MetalChair mChair = new MetalChair("Minimal couch", "Stainless steel", 4, 5.12, 3.6);
        MetalTable mTable = new MetalTable("Minimal Diner", "Stainless steel", 6, 5.12, 3.6);
        WoodenChair wChair = new WoodenChair("Vintage bench", "Ebony", 3, 2.36, 1.07);
        WoodenTable wTable = new WoodenTable("Family Diner", "Mahogany", 10, 4.08, 1.12);

        mChair.fireTest();
        mChair.stressTest();
        mChair.showDetails();

        mTable.fireTest();
        mTable.stressTest();
        mTable.showDetails();

        wChair.fireTest();
        wChair.stressTest();
        wChair.showDetails();

        wTable.fireTest();
        wTable.stressTest();
        wTable.showDetails();
    }
}
