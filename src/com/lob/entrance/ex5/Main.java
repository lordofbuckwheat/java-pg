package com.lob.entrance.ex5;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in).useDelimiter(System.lineSeparator());
        while (true) {
            System.out.print("Enter a number: ");
            if (!scanner.hasNext()) {
                break;
            }
            if (scanner.hasNextInt()) {
                var n = scanner.nextInt();
                if (n <= 0 || n > 100) {
                    System.out.println("incorrect input");
                    continue;
                }
                var palindromes = IntStream.rangeClosed(0, n)
                        .filter(Main::isPalindrome)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(", "));
                System.out.println("palindromes: " + palindromes);
            } else {
                if (scanner.next().equals("q")) {
                    break;
                }
                System.out.println("incorrect input");
            }
        }
    }

    private static boolean isPalindrome(int n) {
        var c = n;
        var rev = 0;
        while (n > 0) {
            var rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return c == rev;
    }

}
