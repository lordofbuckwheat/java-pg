package com.lob.entrance.ex6;

public class Main {

    public static void main(String[] args) {
        var knapsack = new Knapsack(67);
        var items = new Item[]{
                new Item("Item 1", 23, 505),
                new Item("Item 2", 26, 352),
                new Item("Item 3", 20, 458),
                new Item("Item 4", 18, 220),
                new Item("Item 5", 32, 354),
                new Item("Item 6", 27, 414),
                new Item("Item 7", 29, 498),
                new Item("Item 8", 26, 545),
                new Item("Item 9", 30, 473),
                new Item("Item 10", 57, 543),
        };
        knapsack.fill(items);
        System.out.println("knapsack value: " + knapsack.getValue());
    }

}
