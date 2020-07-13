package com.lob.entrance.ex4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Text: ");
        var text = scanner.nextLine();
        System.out.print("Word: ");
        var word = scanner.nextLine().trim().toLowerCase();
        var count = Arrays.stream(text.split("\\P{L}+")).map(String::toLowerCase).filter(s -> s.equals(word)).count();
        System.out.printf("Number of matches: %d\n", count);
    }

}
