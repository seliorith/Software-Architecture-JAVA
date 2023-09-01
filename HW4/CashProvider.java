package HW4;

public class CashProvider {
    private long card;
    private long hashCard;
    private boolean isAuthorization;

    public CashProvider(long card, long hashCard) {
        this.card = card;
        this.hashCard = hashCard;
        this.isAuthorization = false;
    }
    public void authorization(Customer customer) {
        // Логика авторизации
        isAuthorization = true;
    }

    public void buy(double price) {
        if (isAuthorization && cardHasFunds(price)) {
            // Логика покупки
        } else {
            // Обработка ошибок
        }
    }

    public boolean cardHasFunds(double amount) {
        // Проверка наличия средств на карте
        return true; // Или false, в зависимости от логики
    }
}
