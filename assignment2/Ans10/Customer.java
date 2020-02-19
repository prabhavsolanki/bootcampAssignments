package assignment2.Ans10;

public class Customer extends Restaurant implements Person  {
    protected String  name;
    protected String  phoneNumber;
    protected String role;
    protected static int customerID = 0;
    protected boolean hasOrdered;
    protected int token;

    public int getCustomerID() {
        return customerID;
    }

    public void addPerson(String name, String phoneNumber, String role){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.role = role;
        customerID++;
    }

//    Method for placing order
    public Order placeOrder(Cashier cashier) throws InterruptedException {
        System.out.println("Customer: Pays and places order");
        Thread.sleep(2000);
        Order order = cashier.acceptOrder(this);
        token = order.getOrderID();
        return order;
    }

//    Method for checking order status and receiving it
    public boolean receivedOrder(Order order){
        if (order.orderReady){
            readyOrders.remove(order);
            System.out.println("Customer: 'Thanks for the coffee'");
            return true;
        }
        return false;
    }
}