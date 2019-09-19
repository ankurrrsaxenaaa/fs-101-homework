package com.xebia.day3;


public class Calculator {


    public static void main(String[] args) {

        Calculator cashCalculator = new Calculator();


        Customer ram = Customer.createInstance("Ram", 5000);
        Customer shaam = Customer.createInstance("Shaam", 2500);


        Item candy = Item.createInstance("Candy", 1);
        Item muffin = Item.createInstance("Muffin", 50);
        Item chocolateCake = Item.createInstance("Chocolate Cake", 100);
        Item softDrink = Item.createInstance("Soft Drink", 15);
        Item appleBeer = Item.createInstance("Apple Beer", 75);


        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addItems(candy, 100);
        vendingMachine.addItems(muffin, 50);
        vendingMachine.addItems(chocolateCake, 30);
        vendingMachine.addItems(softDrink, 10);
        vendingMachine.addItems(appleBeer, 20);


        cashCalculator.calculateBalance(ram, 30, candy, vendingMachine);
        cashCalculator.calculateBalance(shaam, 10, muffin, vendingMachine);
        cashCalculator.calculateBalance(shaam, 5, chocolateCake, vendingMachine);
        cashCalculator.calculateBalance(ram, 3, chocolateCake, vendingMachine);
        cashCalculator.calculateBalance(ram, 2, appleBeer, vendingMachine);
        cashCalculator.calculateBalance(shaam, 3, softDrink, vendingMachine);
        cashCalculator.calculateBalance(ram, 2, softDrink, vendingMachine);
        //Father gave 1000 to shaam
        shaam.cashCredit(1000);
        cashCalculator.calculateBalance(shaam, 5, chocolateCake, vendingMachine);

    }

    public void calculateBalance(Customer customer, int quantity, Item item, VendingMachine vendingMachine) {
        purchaseStatus(customer, vendingMachine);
        int availableBalance = customer.getCurrentBalance();
        int purchaseCost = item.getPrice() * quantity;
        int itemQuantityInInventory = vendingMachine.getQuantity(item);
        if (itemQuantityInInventory >= quantity && availableBalance >= purchaseCost) {
            customer.setCurrentBalance(availableBalance - purchaseCost);
            vendingMachine.purchasedItem(item, quantity);
        }
        purchaseStatus(customer, vendingMachine);
    }

    private void purchaseStatus(Customer customer, VendingMachine vendingMachine) {
        System.out.println(customer);
        System.out.println(vendingMachine);
    }
}
