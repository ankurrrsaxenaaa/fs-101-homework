package question01;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    List<Product> itemsInStock;

    private Stock() {
        this.itemsInStock = new ArrayList<Product>();
    }

    private void addItemsToStock(Product product) {
        this.itemsInStock.add(product);
    }

    public static Stock loadStock(Product... products) {
        Stock stock = new Stock();
        if (products != null && products.length != 0) {
            for (Product product : products) {
                stock.addItemsToStock(product);
            }
        }
        return stock;
    }

    public List<Product> getItemsInStock() {
        return itemsInStock;
    }

    public void viewItemsInStock() {
        for (Product product : itemsInStock) {
            System.out.println(product.getProductName() + ":" + product.getQuantity());
        }
    }

    public void reduceQuantity(Product foundProduct, int quantity) {
        foundProduct.reduceQuantity(quantity);
    }

    public void increaseQuantity(Product foundProduct, int quantity) {
        foundProduct.addQuantity(quantity);
    }

    public int totalItemsInStock() {
        int total = 0;
        for (Product product : itemsInStock) {
            total += product.getQuantity();
        }
        return total;
    }
}