package com.example.streams;  // Package declaration

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPipelineExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Stream pipeline: filter even numbers, double them, and collect into a new list
        List<Integer> doubledEvens = numbers.stream()
                .filter(n -> n % 2 == 0)  // Filter even numbers
                .map(n -> n * 2)          // Double the numbers
                .collect(Collectors.toList()); // Collect into a list

        // Output the result
        System.out.println("Doubled even numbers: " + doubledEvens);
    }
}
