package HW4;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1);
        Ticket ticket1 = new Ticket(1,25.00, null, LocalDateTime.now());
        System.out.println(ticket1 + " " + customer1);
    }
}
