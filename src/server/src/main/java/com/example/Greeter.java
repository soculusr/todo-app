package com.example;

/**
 * This is a class. Hello
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * @param name of the person
   * @return Hello message
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
