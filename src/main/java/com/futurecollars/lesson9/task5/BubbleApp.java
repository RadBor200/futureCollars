package com.futurecollars.lesson9.task5;

import java.util.Arrays;

public class BubbleApp {
  public static void main(String[] args) {
    Integer[] Ininteger = new Integer[]{7,2,3,5,1,8,9};
    SortBubble<Integer> sortBubble = new SortBubble<>(Ininteger);
    Integer[] outInteger = sortBubble.bubbleSort();

    System.out.println(Arrays.toString(outInteger));
  }
}
