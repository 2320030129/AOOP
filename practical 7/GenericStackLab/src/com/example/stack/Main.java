package com.example.stack;

public class Main {
    public static void main(String[] args) {
        // Test with LinkedListStack
        System.out.println("Testing LinkedListStack:");
        Stack<Integer> linkedListStack = new LinkedListStack<>();
        linkedListStack.push(10);
        linkedListStack.push(20);
        linkedListStack.push(30);
        System.out.println("Top element: " + linkedListStack.peek());  // Should print 30
        System.out.println("Popped element: " + linkedListStack.pop());  // Should print 30
        System.out.println("Top element after pop: " + linkedListStack.peek());  // Should print 20

        // Test with ArrayStack
        System.out.println("\nTesting ArrayStack:");
        Stack<String> arrayStack = new ArrayStack<>(5);
        arrayStack.push("apple");
        arrayStack.push("banana");
        arrayStack.push("cherry");
        System.out.println("Top element: " + arrayStack.peek());  // Should print "cherry"
        System.out.println("Popped element: " + arrayStack.pop());  // Should print "cherry"
        System.out.println("Top element after pop: " + arrayStack.peek());  // Should print "banana"

        // Test isEmpty method
        System.out.println("\nIs LinkedListStack empty? " + linkedListStack.isEmpty());
        linkedListStack.pop();
        linkedListStack.pop();
        System.out.println("Is LinkedListStack empty after popping all elements? " + linkedListStack.isEmpty());
    }
}
