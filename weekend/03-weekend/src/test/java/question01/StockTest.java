package question01;

import org.junit.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.*;

public class StockTest {

    @Test
    public void should_add_products_in_stock() {
        Stock stock = Stock.loadStock(
                Product.newProduct("OpenShift CookBook", 5, BigDecimal.valueOf(3000)),
                Product.newProduct("Xebia Pen", 10, BigDecimal.valueOf(50)),
                Product.newProduct("Calendar", 8, BigDecimal.valueOf(2000)));
        assertThat(stock.totalItemsInStock()).isEqualTo(23);
    }
    @Test
    public void should_remove_items_from_stock_when_added_in_shopping_cart(){
        Stock stock = Stock.loadStock(
                Product.newProduct("OpenShift CookBook", 5, BigDecimal.valueOf(3000)),
                Product.newProduct("Xebia Pen", 10, BigDecimal.valueOf(50)),
                Product.newProduct("Calendar", 8, BigDecimal.valueOf(2000)));
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProductToCart(stock, new ProductRequest("Openshift cookbook", 1));
        shoppingCart.addProductToCart(stock, new ProductRequest("Xebia pen", 5));
        int totalItems = stock.totalItemsInStock();
        assertThat(totalItems).isEqualTo(17);
    }
    @Test
    public void should_add_item_in_stock_when_removed_from_shopping_cart(){
        Stock stock = Stock.loadStock(
                Product.newProduct("OpenShift CookBook", 5, BigDecimal.valueOf(3000)),
                Product.newProduct("Xebia Pen", 10, BigDecimal.valueOf(50)),
                Product.newProduct("Calendar", 8, BigDecimal.valueOf(2000)));
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProductToCart(stock, new ProductRequest("Openshift cookbook", 1));
        shoppingCart.addProductToCart(stock, new ProductRequest("Xebia pen", 5));
        shoppingCart.removeProductFromCart(stock, new ProductRequest("Xebia pen", 2));
        int totalItems = stock.totalItemsInStock();
        assertThat(totalItems).isEqualTo(19);
    }

}