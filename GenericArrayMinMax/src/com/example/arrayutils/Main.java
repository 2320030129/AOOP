package com.example.arrayutils;  // Replace this with your package name

// Step 1: Create a generic interface to find max and min
interface ArrayOperations<T extends Comparable<T>> {
    T findMax(T[] array);
    T findMin(T[] array);
}

// Step 2: Implement the interface in a generic class
class ArrayUtil<T extends Comparable<T>> implements ArrayOperations<T> {
    
    // Method to find maximum value in an array
    @Override
    public T findMax(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is null or empty.");
        }
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    // Method to find minimum value in an array
    @Override
    public T findMin(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is null or empty.");
        }
        T min = array[0];
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }
}

// Step 3: Test the generic class with different datatypes
public class Main {
    public static void main(String[] args) {
        
        // Integer array example
        Integer[] intArray = {12, 5, 7, 89, 23};
        ArrayUtil<Integer> intUtil = new ArrayUtil<>();
        System.out.println("Integer Array: Max = " + intUtil.findMax(intArray) + ", Min = " + intUtil.findMin(intArray));

        // Float array example
        Float[] floatArray = {12.5f, 7.8f, 22.4f, 1.5f, 9.9f};
        ArrayUtil<Float> floatUtil = new ArrayUtil<>();
        System.out.println("Float Array: Max = " + floatUtil.findMax(floatArray) + ", Min = " + floatUtil.findMin(floatArray));

        // String array example
        String[] stringArray = {"apple", "mango", "banana", "pear", "kiwi"};
        ArrayUtil<String> stringUtil = new ArrayUtil<>();
        System.out.println("String Array: Max = " + stringUtil.findMax(stringArray) + ", Min = " + stringUtil.findMin(stringArray));

        // Character array example
        Character[] charArray = {'a', 'x', 'e', 'r', 'b'};
        ArrayUtil<Character> charUtil = new ArrayUtil<>();
        System.out.println("Character Array: Max = " + charUtil.findMax(charArray) + ", Min = " + charUtil.findMin(charArray));
    }
}
