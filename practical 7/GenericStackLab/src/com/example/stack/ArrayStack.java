package com.example.stack;

import java.util.Arrays;

// Implementing stack using an array
public class ArrayStack<T> implements Stack<T> {
    private T[] array;
    private int top;
    private int capacity;

    // Constructor
    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];  // Creating a generic array
        this.top = -1;  // Top is initially -1 (empty stack)
    }

    @Override
    public void push(T element) {
        if (top == capacity - 1) {
            throw new RuntimeException("Stack overflow!");
        }
        array[++top] = element;  // Add element and move the top
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return array[top--];  // Remove and return the top element
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return array[top];  // Return the top element without removing it
    }

    @Override
    public boolean isEmpty() {
        return top == -1;  // Check if the stack is empty
    }
}
