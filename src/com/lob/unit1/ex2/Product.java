package com.lob.unit1.ex2;

import com.lob.unit1.ex2.product.*;
import com.lob.unit1.ex2.product.computer.*;
import com.lob.unit1.ex2.product.tv.*;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Random;

public abstract class Product {

    private static final List<Class<? extends Product>> classes = List.of(
            Desktop.class, Laptop.class, LCD.class,
            OLED.class, PDP.class, CellPhone.class
    );
    private static final Random rand = new Random();
    private final int price;
    private final int weight;
    private final int size;

    public Product(int price, int weight, int size) {
        this.price = price;
        this.weight = weight;
        this.size = size;
    }

    public static Product create(int price, int weight, int size) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<? extends Product> cls = Product.classes.get(Product.rand.nextInt(Product.classes.size()));
        return cls.getConstructor(int.class, int.class, int.class).newInstance(price, weight, size);
    }

    protected abstract int getSizeFactor();

    public int getPrice() {
        return this.price;
    }

    public int getSize() {
        return this.size * this.getSizeFactor();
    }

    public int getWeight() {
        return this.weight * this.getSizeFactor();
    }

}
