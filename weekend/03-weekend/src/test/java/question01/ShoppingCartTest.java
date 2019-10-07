package question01;

import org.junit.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.*;

public class ShoppingCartTest {

    @Test
    public void should_be_able_to_add_product_to_shopping_cart() {
        Stock stock = Stock.loadStock(
                new Product("OpenShift CookBook", 5, BigDecimal.valueOf(3000)),
                new Product("Xebia Pen", 10, BigDecimal.valueOf(50)),
                new Product("Calendar", 8, BigDecimal.valueOf(2000)));
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProductToCart(stock, new ProductRequest("Openshift cookbook", 1));
        shoppingCart.addProductToCart(stock, new ProductRequest("Xebia pen", 5));
        int totalItems = shoppingCart.viewTotalItemsInCart();
        assertThat(totalItems).isEqualTo(6);
    }

    @Test
    public void should_not_add_product_to_shopping_cart_when_given_invalid_data() {
        Stock stock = Stock.loadStock(
                new Product("OpenShift CookBook", 5, BigDecimal.valueOf(3000)),
                new Product("Xebia Pen", 10, BigDecimal.valueOf(50)),
                new Product("Calendar", 8, BigDecimal.valueOf(2000)));
        ShoppingCart shoppingCart = new ShoppingCart();
        try {
            shoppingCart.addProductToCart(stock, new ProductRequest("Openshift cookbook", 6));
        } catch (Exception e) {
            assertThat(e).isInstanceOf(IllegalArgumentException.class);
            assertThat(e).hasMessage("Item not in stock");
        }
    }

    @Test
    public void should_remove_product_from_shopping_cart_when_given_valid_data() {
        Stock stock = Stock.loadStock(
                new Product("OpenShift CookBook", 5, BigDecimal.valueOf(3000)),
                new Product("Xebia Pen", 10, BigDecimal.valueOf(50)),
                new Product("Calendar", 8, BigDecimal.valueOf(2000)));
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProductToCart(stock, new ProductRequest("Openshift cookbook", 1));
        shoppingCart.addProductToCart(stock, new ProductRequest("Xebia pen", 5));
        shoppingCart.removeProductFromCart(stock, new ProductRequest("Xebia pen", 2));
        int totalItems = shoppingCart.viewTotalItemsInCart();
        assertThat(totalItems).isEqualTo(4);
    }

    @Test
    public void should_not_remove_product_from_shopping_cart_when_given_invalid_data() {
        Stock stock = Stock.loadStock(
                new Product("OpenShift CookBook", 5, BigDecimal.valueOf(3000)),
                new Product("Xebia Pen", 10, BigDecimal.valueOf(50)),
                new Product("Calendar", 8, BigDecimal.valueOf(2000)));
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProductToCart(stock, new ProductRequest("Openshift cookbook", 1));
        shoppingCart.addProductToCart(stock, new ProductRequest("Xebia pen", 5));
        try {
            shoppingCart.removeProductFromCart(stock, new ProductRequest("Xebia pen", 8));
        } catch (Exception e) {
            assertThat(e).isInstanceOf(IllegalArgumentException.class);
            assertThat(e).hasMessage("Item not present in cart");
        }
    }

    @Test
    public void should_list_all_items_in_the_cart_with_total_price(){
        Stock stock = Stock.loadStock(
                new Product("OpenShift CookBook", 5, BigDecimal.valueOf(3000)),
                new Product("Xebia Pen", 10, BigDecimal.valueOf(50)),
                new Product("Calendar", 8, BigDecimal.valueOf(2000)));
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProductToCart(stock, new ProductRequest("Openshift cookbook", 1));
        shoppingCart.addProductToCart(stock, new ProductRequest("Xebia pen", 5));
        int totalItems = shoppingCart.viewTotalItemsInCart();
        shoppingCart.printCart();
        assertThat(totalItems).isEqualTo(6);
    }


}