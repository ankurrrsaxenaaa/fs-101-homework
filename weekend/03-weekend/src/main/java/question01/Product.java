package question01;

import java.math.BigDecimal;

public class Product {
    private String productName;
    private int quantity;
    private BigDecimal price;

    private Product(String productName, int quantity, BigDecimal price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public static Product newProduct(String productName, int quantity, BigDecimal price) {
        return new Product(productName, quantity, price);
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void addQuantity(int quantity) {
        this.quantity = this.quantity+quantity;
    }

    public void reduceQuantity(int quantity) {
        this.quantity = this.quantity-quantity;
    }

}