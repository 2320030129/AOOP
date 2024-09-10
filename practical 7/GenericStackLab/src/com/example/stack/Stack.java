package com.example.stack;

// Generic stack interface
public interface Stack<T> {
    void push(T element);       // Add element to the stack
    T pop();                    // Remove and return the top element
    T peek();                   // Peek at the top element without removing it
    boolean isEmpty();           // Check if the stack is empty
}
