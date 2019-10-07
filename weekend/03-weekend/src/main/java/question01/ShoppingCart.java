package question01;

import java.math.BigDecimal;
import java.util.*;

public class ShoppingCart {
    Map<Product, Integer> cartItems;

    public ShoppingCart() {
        cartItems = new HashMap<>();
    }

    public void addProductToCart(Stock stock, ProductRequest request) {
        Product foundProduct = getProductRequested(stock, request);
        if (foundProduct != null && foundProduct.getQuantity() > request.getQuantity()) {
            if (cartItems.containsKey(foundProduct)) {
                cartItems.put(foundProduct, cartItems.get(foundProduct) + request.getQuantity());
            } else {
                cartItems.put(foundProduct, request.getQuantity());
            }
            stock.reduceQuantity(foundProduct, request.getQuantity());
        } else {
            throw new IllegalArgumentException("Item not in stock");
        }
    }

    private Product getProductRequested(Stock stock, ProductRequest request) {
        List<Product> productsInStock = stock.getItemsInStock();
        for (Product product : productsInStock) {
            if (Objects.equals(product.getProductName().toLowerCase(), request.getProductName().toLowerCase())) {
                return product;
            }
        }
        return null;
    }

    public void removeProductFromCart(Stock stock, ProductRequest request) {
        Product foundProduct = getProductRequested(stock, request);
        if (foundProduct != null) {
            if (foundProduct.getQuantity() == request.getQuantity()) {
                cartItems.remove(foundProduct);
            } else {
                cartItems.put(foundProduct, cartItems.get(foundProduct) - request.getQuantity());
            }
            stock.increaseQuantity(foundProduct, request.getQuantity());
        } else {
            throw new IllegalArgumentException("Item not present in cart");

        }
    }

    public void viewItemsInCart() {
        System.out.println("Item\tQuantity\tPrice\tTotal");
        for (Map.Entry mapElement : cartItems.entrySet()) {
            Product product = (Product) mapElement.getKey();
            int value = (int) mapElement.getValue();
            BigDecimal total = product.getPrice().multiply(new BigDecimal(value));
            System.out.println(product.getProductName() + "\t" + value + "\t" + product.getPrice() + "\t" + total);
        }
    }

    public int viewTotalItemsInCart() {
        int total = 0;
        for (Map.Entry mapElement : cartItems.entrySet()) {
            total = total + (int) mapElement.getValue();
        }
        System.out.println("Total items in cart : " + total);
        return total;
    }
    public void printCart() {
        System.out.println("Item\tQuantity\tPrice\tTotal");
        BigDecimal grandTotal=BigDecimal.ZERO;
        for (Map.Entry mapElement : cartItems.entrySet()) {
            Product product = (Product) mapElement.getKey();
            int value = (int) mapElement.getValue();
            BigDecimal total = product.getPrice().multiply(new BigDecimal(value));
            grandTotal=grandTotal.add(total);
            System.out.println(product.getProductName() + "\t" + value + "\t" + product.getPrice() + "\t" + total);
        }
        System.out.println("Total\t\t\t\t\t"+grandTotal);
    }


}

