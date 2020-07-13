package com.lob.entrance.ex1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter(System.lineSeparator());
        while (true) {
            System.out.print("Enter a number: ");
            if (!scanner.hasNext()) {
                break;
            }
            if (scanner.hasNextLong()) {
                long x = scanner.nextLong();
                if (x > 1) {
                    System.out.printf("%d is %s\n", x, isPrime(x) ? "prime" : "composite");
                }
                System.out.printf("%d is %s\n", x, x % 2 == 0 ? "even" : "odd");
            } else {
                if (scanner.next().equals("q")) {
                    break;
                }
                System.out.println("incorrect input");
            }
        }
    }

    private static boolean isPrime(long n) {
        if (n <= 3) {
            return n > 1;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (long i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

}
