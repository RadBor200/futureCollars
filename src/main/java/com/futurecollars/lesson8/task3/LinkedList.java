package com.futurecollars.lesson8.task3;

public class LinkedList <T> {

  static class Node <T> {

    private final T data;
    private Node next;
    private Node prev;

    public Node(T data) {
      this.data = data;
    }
  }

  private Node head, tail = null;

  private void changeHead() {
    head.prev = null;
  }

  private void changeTail() {
    tail.next = null;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public void addLast(T data) {
    Node newNode = new Node(data);

    if (isEmpty()) {
      head = tail = newNode;
    } else {
      tail = newNode;
      changeTail();
    }
  }

  public Node find(int index) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("out of bounds");
    }
    Node current = head;
    for (int i = 1; i <= index; i++) {
      current = current.next;
    }
    return current;
  }

  public T get(int index) {
    return (T) find(index).data;
  }

  public void remove(int index) {
    Node toRemove = find(index);
    if (index == 0) {
      if (size() > 1) {
        head = toRemove.next;
        changeHead();
      } else {
        head = tail = null;
      }

    } else {
      toRemove.prev.next = toRemove.next;
      toRemove.next.prev = toRemove.prev;
    }
  }

  public void add(int index, T data) {
    if (index == size()) {
      addLast(data);
    } else if (index == 0) {
      Node newNode = new Node(data);
      head.prev = newNode;
      newNode.next = head;
      head = newNode;
      changeHead();

    } else {
      Node nextNode = find(index);
      Node prevNode = nextNode.prev;

      Node newNode = new Node(data);

      newNode.next = nextNode;
      newNode.prev = prevNode;

      nextNode.prev = newNode;
      prevNode.next = newNode;
    }
  }

  public int size() {
    if (isEmpty()) {
      return 0;
    } else {
      Node current = head;
      int size = 0;
      while (current != null) {
        size++;
        current = current.next;
      }
      return size;
    }
  }

  public void printList() {
    Node current = head;
    if (isEmpty()) {
      System.out.println("List is empty.");

    } else {
      System.out.print("The list: ");
      while (current != null) {
        System.out.print(current.data + " ");
        current = current.next;
      }
    }
    System.out.println();
  }
}
