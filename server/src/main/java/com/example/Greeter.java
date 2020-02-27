package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  //TODO: Add javadoc comment
  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
  
  Public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      try {
      ...
      } catch (ApplicationSpecificException ase) {
      logger.error("Caught: " + ase.toString());
      }
      }
}
