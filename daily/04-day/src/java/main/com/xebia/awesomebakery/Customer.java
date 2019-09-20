package com.xebia.awesomebakery;

import java.math.BigDecimal;

public class Customer {

    private String name;
    private BigDecimal amountInWallet;

    public Customer(String name, BigDecimal amountInWallet) {
        this.name = name;
        this.amountInWallet = amountInWallet;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getAmountInWallet() {
        return amountInWallet;
    }

    public void pay(BigDecimal price, int itemQuantity) {
        this.amountInWallet = amountInWallet.subtract(price.multiply(BigDecimal.valueOf(itemQuantity)));
    }

    public void topupWallet(BigDecimal amount) {
        this.amountInWallet=amountInWallet.add(amount);
    }
}