package com.lob.entrance.ex3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            var sentence = scanner.nextLine();
            if (sentence.equals("q")) {
                break;
            }
            var words = Arrays.stream(sentence.split("\\P{L}+"))
                    .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                    .sorted()
                    .collect(Collectors.toList());
            System.out.printf("Number of words: %d\n", words.size());
            System.out.printf("Sorted: %s\n", String.join(" ", words));
        }
    }

}
