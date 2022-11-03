package com.futurecollars.lesson5.task5;

public class Car implements Vehicle {

  private boolean engineStarted;

  public void setEngineStarted(boolean engineStarted) {
    this.engineStarted = engineStarted;
  }

  public boolean isEngineStarted() {
    return engineStarted;
  }

  public void startEngine() {
    if (!engineStarted) {
      engineStarted = true;
    }
  }

  public void stopEngine() {
    if (engineStarted) {
      engineStarted = false;
    }
  }

  @Override
  public void turnLeft() {
    System.out.println("Turn on the left turn signal");
  }

  @Override
  public void turnRight() {
    System.out.println("Turn on the right turn signal");
  }
}
