package com.lob.unit1.ex2;

import com.lob.unit1.ex2.product.CellPhone;
import com.lob.unit1.ex2.product.AbstractProduct;
import com.lob.unit1.ex2.product.computer.Desktop;
import com.lob.unit1.ex2.product.computer.Laptop;
import com.lob.unit1.ex2.product.tv.Lcd;
import com.lob.unit1.ex2.product.tv.Oled;
import com.lob.unit1.ex2.product.tv.Pdp;
import com.lob.unit1.ex2.stock.OutOfSpaceException;
import com.lob.unit1.ex2.stock.Stock;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//Написать‌ ‌программу,‌ содержащую‌ ‌иерархии‌ ‌товаров‌ ‌для‌ ‌склада.‌ ‌Заполнить‌ ‌склад‌ ‌до‌ ‌предела‌ ‌и‌ ‌высчитать‌ ‌вес‌ ‌хранимого‌ ‌товара.‌
public class Main {

  public static void main(String[] args)
      throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
    Random rand = new Random();
    List<Class<? extends AbstractProduct>> productClasses = Arrays.asList(
        Desktop.class, Laptop.class, Lcd.class,
        Oled.class, Pdp.class, CellPhone.class
    );

    Stock stock = new Stock(rand.nextInt(9000) + 1000);

    AbstractProduct product;
    while (true) {
      Class<? extends AbstractProduct> cls = productClasses
          .get(rand.nextInt(productClasses.size()));
      int price = rand.nextInt(9000) + 1000;
      int weight = rand.nextInt(9000) + 1000;
      int size = rand.nextInt(90) + 10;
      product = cls.getConstructor(int.class, int.class, int.class)
          .newInstance(price, weight, size);
      try {
        stock.place(product);
      } catch (OutOfSpaceException ex) {
        break;
      }
    }

    System.out.printf("summary weight: %d\n", stock.summaryWeight());
    System.out.printf("summary price: %d\n", stock.summaryPrice());
  }

}
