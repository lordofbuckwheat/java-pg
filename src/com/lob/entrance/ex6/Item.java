package com.lob.entrance.ex6;

public class Item {
    private String name;
    private final int weight;
    private final int value;

    public Item(String name, int weight, int value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }

}
