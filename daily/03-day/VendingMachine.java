package com.xebia.day3;
import java.util.HashMap;
import java.util.Map;


public class VendingMachine {

    private Map<Item, Integer> inventory = new HashMap<>();

    public VendingMachine() {
    }

    public void addItems(Item item, int quantity) {
        if (inventory.containsKey(item)) {
            inventory.put(item, inventory.get(item) + quantity);
        } else {
            inventory.put(item, quantity);
        }
    }

    public int getQuantity(Item item) {
        if (inventory.containsKey(item))
            return inventory.get(item);
        else
            return 0;
    }

    public void purchasedItem(Item item, int purchasedQuantity) {
        if (inventory.containsKey(item)) {
            inventory.put(item, inventory.get(item) - purchasedQuantity);
        }
    }

    @Override
    public String toString() {
        String inventoryStatus = "";
        for (Item item : inventory.keySet()) {
            inventoryStatus += (item.getName() + " - " + inventory.get(item)) + " \t";
        }
        return inventoryStatus + "\n";
    }
}
