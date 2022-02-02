package preventRefactorability;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class ShoppingCarts_price_after_discount {

    @Nested
    class with_mock {

        @Test
        void no_discount() {
            //Mockito will automatically return 0, unless told otherwise
            DiscountCalculator discountCalculator = Mockito.mock(DiscountCalculator.class);
            ShoppingCart shoppingCart = new ShoppingCart(discountCalculator);
            shoppingCart.add(new Product(150));

            Integer price = shoppingCart.priceAfterDiscount();

            assertEquals(150, price);
        }

        @Test
        void discount_is_20() {
            DiscountCalculator discountCalculator = Mockito.mock(DiscountCalculator.class);
            Mockito.when(discountCalculator.discount(any(List.class))).thenReturn(20);
            ShoppingCart shoppingCart = new ShoppingCart(discountCalculator);
            shoppingCart.add(new Product(150));

            Integer price = shoppingCart.priceAfterDiscount();

            assertEquals(130, price);
        }
    }

    @Nested
    class without_mock {

        @Test
        void no_discount() {
            DiscountCalculator discountCalculator = new DiscountCalculator();
            ShoppingCart shoppingCart = new ShoppingCart(discountCalculator);
            shoppingCart.add(new Product(90));

            Integer price = shoppingCart.priceAfterDiscount();

            assertEquals(90, price);
        }

        @Test
        void discount_is_20() {
            DiscountCalculator discountCalculator = new DiscountCalculator();
            ShoppingCart shoppingCart = new ShoppingCart(discountCalculator);
            shoppingCart.add(new Product(150));

            Integer price = shoppingCart.priceAfterDiscount();

            assertEquals(130, price);
        }
    }
}