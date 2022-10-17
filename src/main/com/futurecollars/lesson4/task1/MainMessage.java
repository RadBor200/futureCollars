package com.futurecollars.lesson4.task1;

public class MainMessage {
  public static void main(String[] args) {
    WindowMessage windowMessage = new WindowMessage();
    System.out.println(windowMessage.getMessage());
    ConsoleMessage consoleMessage = new ConsoleMessage();
    System.out.println(consoleMessage.getMessage());
  }
}
