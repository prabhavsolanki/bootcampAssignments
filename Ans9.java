package assignment;

// Q9. Write a program to display values of enums using a constructor
// & getPrice() method (Example display house & their prices)

enum House{
    Villa(50), Apartment(2), Flat(13);
    private int price;
    House(int p) {
        price = p;
    }
    int getPrice(){
        return price;
    }
}

public class Ans9 {
    public static void main(String[] args) {
        System.out.println("Prices for all kinds of houses: ");
        for (House H: House.values()){
            System.out.println(H + " costs " + H.getPrice() + " lac rupees");
        }
    }
}




