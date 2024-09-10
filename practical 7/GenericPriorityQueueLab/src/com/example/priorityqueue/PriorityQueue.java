package com.example.priorityqueue;

import java.util.ArrayList;
import java.util.Comparator;

// Generic Priority Queue class with Min-Heap implementation
public class PriorityQueue<T> {
    private ArrayList<T> heap;
    private Comparator<? super T> comparator;

    // Constructor with comparator
    public PriorityQueue(Comparator<? super T> comparator) {
        this.heap = new ArrayList<>();
        this.comparator = comparator;
    }

    // Insert element into the priority queue
    public void insert(T element) {
        heap.add(element);
        heapifyUp(heap.size() - 1);
    }

    // Remove and return the highest priority (min or max) element
    public T remove() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Priority queue is empty.");
        }
        T removedValue = heap.get(0);
        T lastValue = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, lastValue);
            heapifyDown(0);
        }
        return removedValue;
    }

    // Peek at the highest priority element without removing it
    public T peek() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Priority queue is empty.");
        }
        return heap.get(0);
    }

    // Check if the priority queue is empty
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    // Helper method to maintain heap property (heapify up)
    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        T current = heap.get(index);

        while (index > 0 && comparator.compare(current, heap.get(parentIndex)) < 0) {
            heap.set(index, heap.get(parentIndex));
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }

        heap.set(index, current);
    }

    // Helper method to maintain heap property (heapify down)
    private void heapifyDown(int index) {
        int leftChild, rightChild, smallestChild;
        T current = heap.get(index);

        while (index < heap.size() / 2) {
            leftChild = 2 * index + 1;
            rightChild = 2 * index + 2;

            smallestChild = leftChild;
            if (rightChild < heap.size() && comparator.compare(heap.get(rightChild), heap.get(leftChild)) < 0) {
                smallestChild = rightChild;
            }

            if (comparator.compare(current, heap.get(smallestChild)) <= 0) {
                break;
            }

            heap.set(index, heap.get(smallestChild));
            index = smallestChild;
        }

        heap.set(index, current);
    }
}
