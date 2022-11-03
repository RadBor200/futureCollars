package com.futurecollars.lesson8.task2;

public class MainOwnList implements OwnList {

  private Integer[] data;
  private int maxCapacity;
  private int currentSize;
  private static final int DEFAULT_CAPACITY = 10;
  private static final int EXTENSION_STEP = 10;

  public MainOwnList() {
    this(DEFAULT_CAPACITY);

  }

  public MainOwnList(int maxCapacity) {
    this.maxCapacity = maxCapacity;
    data = new Integer[maxCapacity];
    currentSize = 0;

  }

  @Override
  public int size() {
    return currentSize;
  }

  @Override
  public boolean isEmpty() {
    return currentSize == 0;
  }

  private void extendList() {
    if (currentSize == maxCapacity) {
      Integer[] dataCopy = new Integer[currentSize + EXTENSION_STEP];
      System.arraycopy(data, 0, dataCopy, 0, currentSize);
      maxCapacity += EXTENSION_STEP;
      data = dataCopy;
    }
  }

  @Override
  public void add(Integer element) {
    extendList();
    data[currentSize] = element;
    currentSize++;
  }

  @Override
  public Integer get(int i) {
    if (i < 0 || i >= currentSize) {
      throw new RuntimeException("Out of bounds");
    }
    return data[i];
  }

  @Override
  public void add(int index, Integer element) {
    if (index < 0 || index >= currentSize) {
      throw new RuntimeException("Out of bounds");
    }
    extendList();

    System.arraycopy(data, index, data, index + 1, currentSize - index);
    data[index] = element;
    currentSize++;
  }

  @Override
  public void remove(int index) {
    if (index < 0 || index >= currentSize) {
      throw new RuntimeException("Out of bounds");
    }
    System.arraycopy(data, index + 1, data, index, currentSize - index);
    currentSize--;
  }

  @Override
  public String toString() {
    StringBuilder elements = new StringBuilder();
    for (int i = 0; i < currentSize; i++) {
      elements.append(data[i].toString()).append("\n");
    }
    return elements.toString();

  }
}
