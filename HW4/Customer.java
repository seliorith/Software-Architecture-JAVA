package HW4;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private List<Ticket> tickets;
    private CashProvider cash;

    public Customer(int id) {
        this.id = id;
        this.tickets = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setCash(CashProvider cash) {
        this.cash = cash;
    }

    public boolean buyTicket(Ticket ticket) {
        if (cash != null) {
            if (cash.cardHasFunds(ticket.getPrice())) {
                cash.buy(ticket.getPrice());
                tickets.add(ticket);
                return true;
            } else {
                // Обработка ошибок
            }
        } else {
            // Обработка ошибок
        }
        return false;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", tickets=" + tickets +
                ", cash=" + cash +
                '}';
    }

    public List<Ticket> search(LocalDateTime date, long rootNumber) {
        // Логика поиска билетов
        return new ArrayList<>(); // Вернуть список найденных билетов
    }
}
