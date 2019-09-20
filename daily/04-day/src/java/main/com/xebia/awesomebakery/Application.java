package com.xebia.awesomebakery;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {
        Customer ram = new Customer("Ram", BigDecimal.valueOf(5000));
        Customer shaam = new Customer("Shaam", BigDecimal.valueOf(2500));

        VendingMachine foodVendingMachine = VendingMachine.with(
                new Item("Candy", BigDecimal.valueOf(1), 100),
                new Item("Muffin", BigDecimal.valueOf(50), 50),
                new Item("Chocolate Cake", BigDecimal.valueOf(100), 30));

        VendingMachine beverageVendingMachine = VendingMachine.with(
                new Item("Soft Drink", BigDecimal.valueOf(15), 10),
                new Item("Apple Beer", BigDecimal.valueOf(75), 20));

        //Ram buys 30 candies
        executeTransaction(ram, foodVendingMachine, "Candy", 30);

        //Shaam buys 10 Muffins
        executeTransaction(shaam, foodVendingMachine, "Muffin", 10);

        //Shaam buys 5 chocolates
        executeTransaction(shaam, foodVendingMachine, "Chocolate Cake", 5);

        //Ram bus 3 chocolate cakes
        executeTransaction(ram, foodVendingMachine, "Chocolate Cake", 3);

        //Ram buys 2 Apple beer
        executeTransaction(ram, beverageVendingMachine, "Apple Beer", 2);

        //Shaam buys 3 soft drinks
        executeTransaction(shaam, beverageVendingMachine, "Soft Drink", 3);

        //Ram buys 2 soft drinks
        executeTransaction(ram, beverageVendingMachine, "Soft Drink", 2);

        //Shaam father gave Rs. 1000 more to him
        shaam.topupWallet(BigDecimal.valueOf(1000));

        //Shaam buys 5 Chocolate cakes
        executeTransaction(shaam, foodVendingMachine, "Chocolate Cake", 5);

        System.out.println("Cash Balance");
        System.out.println("Ram Balance: "+ ram.getAmountInWallet());
        System.out.println("Shaam Balance: "+ shaam.getAmountInWallet());

        System.out.println("Food Vending Machine Summary");
        foodVendingMachine.printSummary();
        System.out.println("Beverage Vending Machine Summary");
        beverageVendingMachine.printSummary();
    }

    private static void executeTransaction(Customer customer, VendingMachine vendingMachine, String itemName, int quantity) {
        BuyRequest buyRequest = new BuyRequest(itemName, quantity);
        Item item = vendingMachine.takeItems(buyRequest);
        customer.pay(item.getPrice(), buyRequest.getItemQuantity());
    }
}
