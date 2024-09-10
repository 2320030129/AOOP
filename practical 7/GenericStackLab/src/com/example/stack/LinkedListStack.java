package com.example.stack;

import java.util.LinkedList;

// Implementing stack using LinkedList
public class LinkedListStack<T> implements Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    @Override
    public void push(T element) {
        list.addFirst(element);  // Push element to the front (head) of the list
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return list.removeFirst();  // Remove and return the top element
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return list.getFirst();  // Return the top element without removing it
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();  // Check if the stack is empty
    }
}
