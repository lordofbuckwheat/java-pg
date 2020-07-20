package com.lob.unit1.ex2;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;

//Написать‌ ‌программу,‌ содержащую‌ ‌иерархии‌ ‌товаров‌ ‌для‌ ‌склада.‌ ‌Заполнить‌ ‌склад‌ ‌до‌ ‌предела‌ ‌и‌ ‌высчитать‌ ‌вес‌ ‌хранимого‌ ‌товара.‌
public class Main {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Random rand = new Random();
        Stock stock = new Stock(rand.nextInt(9000) + 1000);
        Product product;
        do {
            product = Product.create(rand.nextInt(9000) + 1000, rand.nextInt(9000) + 1000, rand.nextInt(90) + 10);
        } while (stock.place(product));
        System.out.printf("summary weight: %d\n", stock.summaryWeight());
        System.out.printf("summary price: %d\n", stock.summaryPrice());
    }

}
