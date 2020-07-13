package com.lob.entrance.ex6;

public class Knapsack {
    private int capacity;
    private int value;

    public Knapsack(int capacity) {
        this.capacity = capacity;
    }

    public void fill(Item[] content) {
        var items = new Item[content.length + 1];
        System.arraycopy(content, 0, items, 1, items.length - 1);
        var m = new int[items.length][capacity + 1];
        for (var i = 1; i < items.length; i++) {
            for (var j = 0; j < capacity + 1; j++) {
                if (items[i].getWeight() > j) {
                    m[i][j] = m[i - 1][j];
                } else {
                    m[i][j] = Math.max(m[i - 1][j], m[i - 1][j - items[i].getWeight()] + items[i].getValue());
                }
            }
        }
        value = m[items.length - 1][capacity];
    }

    public int getValue() {
        return value;
    }

}