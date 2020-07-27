package com.lob.unit1.ex1;

import java.util.Random;

public class NumberUtils {

  public static int generateRandom(int min, int max) {
    return new Random().nextInt(max - min) + min;
  }

  public static int getLargestDigit(int n) {
    int largest = 0;
    while (n != 0) {
      int r = n % 10;
      largest = Math.max(r, largest);
      n = n / 10;
    }
    return largest;
  }

}
