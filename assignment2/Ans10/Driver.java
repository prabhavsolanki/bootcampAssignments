package assignment2.Ans10;


// Driver class
public class Driver extends Restaurant {
    public static void main(String[] args) throws InterruptedException {

        Customer customer = new Customer();
        customer.addPerson("Shayan", "786725563", "Customer");

        Cashier cashier = new Cashier();
        cashier.addPerson("Ammar","7458961452", "Cashier");

        Barista barista = new Barista();
        barista.addPerson("Sara", "6985471254", "Barista");

        Order order = customer.placeOrder(cashier);

        while(!customer.receivedOrder(order)){
            System.out.println("Ready token numbers: ");
            readyOrders.forEach((v) -> {
                System.out.print(v.getOrderID() + " ");
            });
            System.out.println("Waiting for token no " + customer.token);
            Thread.sleep(2000);
        }

    }
}
