package com.generics;

public interface FindMaxMin<T extends Comparable<T>> {
    T findMax(T[] array);
    T findMin(T[] array);
}
