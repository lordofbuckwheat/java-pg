package com.lob.entrance.ex4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Text: ");
        String text = scanner.nextLine();
        System.out.print("Word: ");
        String word = scanner.nextLine().trim().toLowerCase();
        long count = Arrays.stream(text.split("\\P{L}+")).map(String::toLowerCase).filter(s -> s.equals(word)).count();
        System.out.printf("Number of matches: %d\n", count);
    }

}
