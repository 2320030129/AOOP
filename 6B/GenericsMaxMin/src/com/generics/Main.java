package com.generics;

public class Main {
    public static void main(String[] args) {
        // Testing Integer array
        Integer[] intArray = { 10, 20, 5, 25, 15 };
        FindMaxMinImpl<Integer> intFinder = new FindMaxMinImpl<>();
        System.out.println("Integer Array:");
        System.out.println("Max: " + intFinder.findMax(intArray));
        System.out.println("Min: " + intFinder.findMin(intArray));

        // Testing Float array
        Float[] floatArray = { 10.5f, 20.1f, 5.3f, 25.7f, 15.9f };
        FindMaxMinImpl<Float> floatFinder = new FindMaxMinImpl<>();
        System.out.println("\nFloat Array:");
        System.out.println("Max: " + floatFinder.findMax(floatArray));
        System.out.println("Min: " + floatFinder.findMin(floatArray));

        // Testing Character array
        Character[] charArray = { 'a', 'z', 'c', 'b', 'x' };
        FindMaxMinImpl<Character> charFinder = new FindMaxMinImpl<>();
        System.out.println("\nCharacter Array:");
        System.out.println("Max: " + charFinder.findMax(charArray));
        System.out.println("Min: " + charFinder.findMin(charArray));

        // Testing String array
        String[] stringArray = { "apple", "banana", "cherry", "date" };
        FindMaxMinImpl<String> stringFinder = new FindMaxMinImpl<>();
        System.out.println("\nString Array:");
        System.out.println("Max: " + stringFinder.findMax(stringArray));
        System.out.println("Min: " + stringFinder.findMin(stringArray));
    }
}
