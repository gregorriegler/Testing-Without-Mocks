package harm_refactorability;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final DiscountCalculator discountCalculator;
    private final List<Product> products = new ArrayList<>();

    public ShoppingCart(DiscountCalculator discountCalculator) {
        this.discountCalculator = discountCalculator;
    }

    public void add(Product product) {
        products.add(product);
    }

    public Integer priceAfterDiscount() {
        return total() - discount();
    }

    private Integer total() {
        Integer total = 0;
        for (Product product : products) {
            total += product.price();
        }
        return total;
    }

    private Integer discount() {
        return discountCalculator.discount(products);
    }

}
