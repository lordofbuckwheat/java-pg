package com.lob.unit1.ex2;

import com.lob.unit1.ex2.product.TV;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public abstract class Product {
    private final List<Class<? extends Product>> showcase = List.of(
            Product.class,
            TV.class
    );

    public static Product create() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return Product.class.getConstructor(int.class).newInstance(123);
    }

}
