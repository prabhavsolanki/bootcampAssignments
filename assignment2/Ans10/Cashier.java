package assignment2.Ans10;

public class Cashier extends Restaurant implements Person {
    protected String  name;
    protected String  phoneNumber;
    protected String role;
    protected static int employeeID = 0;

    public void addPerson(String name, String phoneNumber, String role){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.role = role;
        employeeID++;
    }

//    Getter
    public int getEmployeeID() {
        return employeeID;
    }

//    Method to accept order, add it to the queue and process it
    public Order acceptOrder(Customer customer) throws InterruptedException {
        customer.hasOrdered = true;
        System.out.println("Cashier: Order placed successfully.");
        Thread.sleep(2000);
        Order order = new Order();
        order.customerID = customer.getCustomerID();
        currentOrders.add(order);
        System.out.println("Please wait for your token no " + order.getOrderID());
        return order;
    }
}