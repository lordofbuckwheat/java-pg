package com.lob.unit1.ex1;

// Написать‌ ‌программу,‌ выводящую‌ ‌на‌ ‌экран‌ ‌случайно‌ ‌сгенерированное‌ ‌трёхзначное‌ ‌натуральное‌ ‌число‌ ‌и‌ ‌его‌ ‌наибольшую‌ ‌цифру‌
public class Main {

  public static void main(String[] args) {
    int n = NumberUtils.generateRandom(100, 1000);
    System.out.printf("Random number: %d\n", n);
    System.out.printf("Largest digit: %d\n", NumberUtils.getLargestDigit(n));
  }

}
