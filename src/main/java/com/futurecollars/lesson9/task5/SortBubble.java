package com.futurecollars.lesson9.task5;

public class SortBubble<T extends Comparable<? super T>> {
  T[] array;

  public SortBubble(T[] array) {
    this.array = array;
  }

  public T[] bubbleSort() {
    int k = array.length;
    do {
      for (int i = 0; i < k - 1; i++) {
        if (array[i].compareTo(array[i + 1]) > 0) {
          T t = array[i];
          array[i] = array[i + 1];
          array[i + 1] = t;
        }
      }
      k = k - 1;
    }
    while (k > 1) ;
    return array;
  }
}
