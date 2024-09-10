package com.example.priorityqueue;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Test with Integers (Min-Heap)
        PriorityQueue<Integer> intQueue = new PriorityQueue<>(Comparator.naturalOrder());
        intQueue.insert(15);
        intQueue.insert(10);
        intQueue.insert(30);
        intQueue.insert(5);
        
        System.out.println("Min-Heap Integer Priority Queue:");
        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.remove());  // Should print elements in ascending order
        }

        // Test with Doubles (Min-Heap)
        PriorityQueue<Double> doubleQueue = new PriorityQueue<>(Comparator.naturalOrder());
        doubleQueue.insert(3.5);
        doubleQueue.insert(1.1);
        doubleQueue.insert(4.8);
        doubleQueue.insert(2.2);

        System.out.println("\nMin-Heap Double Priority Queue:");
        while (!doubleQueue.isEmpty()) {
            System.out.println(doubleQueue.remove());  // Should print elements in ascending order
        }

        // Test with Strings (Min-Heap, lexicographical order)
        PriorityQueue<String> stringQueue = new PriorityQueue<>(Comparator.naturalOrder());
        stringQueue.insert("banana");
        stringQueue.insert("apple");
        stringQueue.insert("cherry");
        stringQueue.insert("date");

        System.out.println("\nMin-Heap String Priority Queue:");
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.remove());  // Should print strings in lexicographical order
        }
    }
}
