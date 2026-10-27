package edu.cnm.deepdive.animals;

import java.time.Instant;

public abstract class Canis {

  private static final Instant initializedAt = now();

  private static int count = 0;

  static {
    System.out.println("Canis static initialization");
  }

  {
    System.out.println("Canis instance initialization");
  }

  public Canis() {
    System.out.println("Canis constructor prologue");
    super();
    System.out.println("Canis constructor epilogue");
  }

  public abstract void vocalize();

  public abstract void hunt();

  public static void identify() {
    System.out.println("I am a Canis");
  }

  private static Instant now() {
    System.out.println("Canis.now() static method");
    return Instant.now();
  }

}
