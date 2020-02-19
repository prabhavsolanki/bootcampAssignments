package assignment2.Ans10;

public class Barista extends Restaurant implements Person {
    protected String  name;
    protected String  phoneNumber;
    protected String role;
    protected int employeeID;
    protected double employeeSalary;
    protected Order assignedOrder;

    public void addPerson(String name, String phoneNumber, String role){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.role = role;
    }

    public Barista(){};

//    custom Barista constructor that is assigned an order.
//    Barista accepts, processes and prepares the order and finally adds it to the ready queue
    public Barista(Order order) throws InterruptedException {
        System.out.println("Barista: Order no " + order.getOrderID() + " received.");
        Thread.sleep(2000);
        currentOrders.remove(order);
        System.out.println("Order being prepared");
        Thread.sleep(2000);
        readyOrders.add(order);
        System.out.println("Order ready!");
        order.orderReady = true;
    }
}