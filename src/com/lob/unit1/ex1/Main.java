package com.lob.unit1.ex1;

import java.util.Random;

// Написать‌ ‌программу,‌ выводящую‌ ‌на‌ ‌экран‌ ‌случайно‌ ‌сгенерированное‌ ‌трёхзначное‌ ‌натуральное‌ ‌число‌ ‌и‌ ‌его‌ ‌наибольшую‌ ‌цифру‌
public class Main {

    public static void main(String[] args) {
        int n = new Random().nextInt(900) + 100;
        System.out.printf("Random number: %d\n", n);
        System.out.printf("Largest digit: %d\n", largestDigit(n));
    }

    private static int largestDigit(int n) {
        int largest = 0;
        while (n != 0) {
            int r = n % 10;
            largest = Math.max(r, largest);
            n = n / 10;
        }
        return largest;
    }

}
