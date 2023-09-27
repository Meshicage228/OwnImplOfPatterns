import domain.Product;
import domain.Store;
import service.Discounts;
import service.SubscriberService;

public class ObserverMain {
    public static void main(String[] args) {
        Store store = new Store();

        Product product1 = Product.builder()
                .title("Milk")
                .discounts(Discounts.LITTLE_DISCOUNT)
                .build();

        Product product2 = Product.builder()
                .title("ChesseNavarro")
                .discounts(Discounts.HUGE_DISCOUNT)
                .build();

        Product product3 = Product.builder()
                .title("Orange")
                .build();

        var subscriberService = new SubscriberService();

        store.addObserver(subscriberService);

        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);

    }
}
