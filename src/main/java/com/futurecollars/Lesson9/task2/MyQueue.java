package com.futurecollars.Lesson9.task2;

import java.util.LinkedList;

public class MyQueue implements OwnQueue {

  private final LinkedList<Integer> list = new LinkedList<>();

  @Override
  public boolean add(Integer element) {
    list.addLast(element);
    return true;
  }

  @Override
  public Integer remove() {
    if (list.isEmpty()) {
      return null;
    }
    return list.removeFirst();
  }

  @Override
  public Integer element() {
    if (list.isEmpty()) {
      return null;
    }
    return list.getFirst();
  }

}
