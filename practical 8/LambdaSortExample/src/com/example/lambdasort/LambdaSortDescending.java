package com.example.lambdasort;  // Package declaration

import java.util.ArrayList;
import java.util.List;

public class LambdaSortDescending {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");
        strings.add("date");

        // Sort the list in descending order using a lambda expression
        strings.sort((s1, s2) -> s2.compareTo(s1));

        // Print the sorted list
        System.out.println("Strings sorted in descending order:");
        strings.forEach(System.out::println);
    }
}
