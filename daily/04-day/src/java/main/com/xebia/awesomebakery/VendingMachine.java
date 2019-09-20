package com.xebia.awesomebakery;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VendingMachine {

    private List<Item> items;

    private VendingMachine() {
        this.items = new ArrayList<>();
    }

    public static VendingMachine with(Item... items) {
        VendingMachine vendingMachine = new VendingMachine();
        if (items != null && items.length != 0) {
            for (Item item : items) {
                vendingMachine.addItem(item);
            }
        }
        return vendingMachine;
    }

    private VendingMachine addItem(Item item) {
        this.items.add(item);
        return this;
    }

    public List<Item> getItems() {
        return items;
    }

    public Item takeItems(BuyRequest buyRequest) {
        for (Item item : items) {
            if (Objects.equals(item.getName(), buyRequest.getItemName())) {
                item.updateQuantity(item.getQuantity()-buyRequest.getItemQuantity());
                return item;
            }
        }
        return null;
    }

    public void printSummary() {
        for (Item i : items) {
            System.out.println(i.getName() + " : " + i.getQuantity());
        }
    }
}