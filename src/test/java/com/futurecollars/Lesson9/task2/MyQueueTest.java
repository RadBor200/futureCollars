package com.futurecollars.Lesson9.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

  MyQueue MyQueue = new MyQueue();

  @ParameterizedTest(name = "Element: {0}")
  @ValueSource(ints = {123, 124, 125})
  void shouldBeAdd(Integer element) {
    //when
    boolean expectAdded = MyQueue.add(element);
    //then
    assertTrue(expectAdded);
  }

  @Test
  void shouldBeRemoveFirstElement() {
    //given
    MyQueue.add(11);
    MyQueue.add(12);
    MyQueue.add(7);
    //when
    Integer expectFirstElement = MyQueue.remove();
    //then
    Assertions.assertEquals(11, expectFirstElement);
  }

  @Test
  void shouldNotRemoveElementFromEmptyList() {
    //given
    //when
    Integer expectFirstElement = MyQueue.remove();
    //then
    assertNull(expectFirstElement);
  }

  @Test
  void shouldBeFirstElement() {
    //given
    MyQueue.add(211);
    MyQueue.add(312);
    MyQueue.add(447);
    //when
    Integer expectFirstElement = MyQueue.element();
    //then
    Assertions.assertEquals(211, expectFirstElement);
  }

  @Test
  void shouldNotCheckFirstElementFromEmptyList() {
    //given
    //when
    Integer expectFirstElement = MyQueue.element();
    //then
    assertNull(expectFirstElement);
  }

}
