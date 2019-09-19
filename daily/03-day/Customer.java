package com.xebia.day3;

public class Customer {
    private String name;
    private int currentBalance;

    private Customer(String name, int currentBalance) {
        this.name = name;
        this.currentBalance = currentBalance;
    }

    public Customer(Customer customer, int currentBalance) {
        this.name = customer.name;
        this.currentBalance = currentBalance;
    }

    public static Customer createInstance(String name, int balance) {
        return new Customer(name, balance);
    }

    public String getName() {
        return name;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void cashCredit(int amount) {
        this.currentBalance = this.currentBalance + amount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", currentBalance=" + currentBalance +
                '}';
    }
}
