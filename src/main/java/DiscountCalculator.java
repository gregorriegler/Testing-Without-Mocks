import java.util.List;

public class DiscountCalculator {

    public Integer discount(List<Product> products) {
        Integer total = 0;
        for (Product product : products) {
            total += product.price();
        }
        if (total <= 100) return 0;
        return 20;
    }

}
