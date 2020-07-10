package com.lob.entrance.ex2;

import java.io.EOFException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in).useDelimiter(System.lineSeparator());
        try {
            while (true) {
                var x = readNumber(scanner, "first");
                var y = readNumber(scanner, "second");
                System.out.printf("greatest common divisor: %d\n", gcd(x, y));
                System.out.printf("least common multiple: %d\n", lcm(x, y));
            }
        } catch (EOFException ignored) {
        }
    }

    private static long readNumber(Scanner scanner, String label) throws EOFException {
        while (true) {
            System.out.printf("Enter %s number: ", label);
            if (!scanner.hasNext()) {
                throw new EOFException();
            }
            if (scanner.hasNextLong()) {
                var result = scanner.nextLong();
                if (result < 1) {
                    System.out.println("incorrect input");
                    continue;
                }
                return result;
            } else {
                if (scanner.next().equals("q")) {
                    throw new EOFException();
                }
                System.out.println("incorrect input");
            }
        }
    }

    private static long gcd(long a, long b) {
        if (a < 1 || b < 1)
            throw new IllegalArgumentException("a or b is less than 1");
        while (b != 0) {
            var tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }

    private static long lcm(long a, long b) {
        return Math.abs(a * b) / gcd(a, b);
    }
}
