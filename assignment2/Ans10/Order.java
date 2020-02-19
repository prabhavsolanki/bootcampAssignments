package assignment2.Ans10;

public class Order {
    static int orderID = 0;
    protected int customerID;
    protected int baristaID;
    protected boolean orderReady = false;
    
    public int getOrderID() {
        return orderID;
    }

//    Custom constructor for creating order and assigning the order to a Barista
    public Order() throws InterruptedException {
        orderID++;
        Barista barista = new Barista(this);
    }

}