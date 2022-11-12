package com.futurecollars.Lesson9.task1;

import com.futurecollars.Lesson9.task1.MyMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMapTest {
  private MyMap<String, String> myMap;

  @BeforeEach
  void setUp() {
    myMap = new MyMap<>();
  }

  @Test
  void shouldVerifyIfMapIsEmpty() {

    boolean isEmpty = myMap.isEmpty();
    Assertions.assertTrue(isEmpty);
  }

  @Test
  void shouldVerifyIfMapIsNotEmpty() {

    myMap.put("23", "Warsaw");
    myMap.put("32", "London");

    boolean isEmpty = myMap.isEmpty();
    Assertions.assertFalse(isEmpty);
  }

  @Test
  void shouldVerifyGettingValueWithSpecificKey() {

    myMap.put("69", "Tokyo");

    String value = myMap.get("69");
    Assertions.assertEquals("Tokyo", value);
  }

  @Test
  void shouldVerifyGettingNullValue() {

    myMap.put("99999", null);

    String value = myMap.get("5");
    Assertions.assertNull(value);
  }

  @Test
  void shouldVerifyGettingValueWithNonExistingKey() {

    String value = myMap.get("96");
    Assertions.assertNull(value);
  }

  @Test
  void shouldVerifyGettingValueWithNullKey() {

    myMap.put(null, "Paris");

    String value = myMap.get(null);
    Assertions.assertEquals("Paris", value);
  }

  @Test
  void shouldOverrideExistingValue() {

    myMap.put("8", "Rome");
    myMap.put("8", "New York");

    String value = myMap.get("8");
    Assertions.assertEquals("New York", value);
  }

  @Test
  void shouldReturnRemovedValue() {

    myMap.put("8", "New York");

    String removedValue = myMap.remove("8");
    Assertions.assertEquals("New York", removedValue);
  }

  @Test
  void shouldNotContainKey() {

    boolean containKey = myMap.containsKey("Madrid");
    Assertions.assertFalse(containKey);
  }

  @Test
  void shouldContainKey() {

    myMap.put("key1", "value1");

    boolean containKey = myMap.containsKey("key1");
    Assertions.assertTrue(containKey);
  }

  @Test
  void shouldNotContainValue() {

    myMap.put("1", "Moscow");
    myMap.put("2", "Lisbon");


    boolean containValue = myMap.containsValue("Mexico City");
    Assertions.assertFalse(containValue);
  }

  @Test
  void shouldContainValue() {

    myMap.put("1", "Moscow");
    myMap.put("2", "Lisbon");

    boolean containValue = myMap.containsValue("Moscow");
    Assertions.assertTrue(containValue);

  }
}
