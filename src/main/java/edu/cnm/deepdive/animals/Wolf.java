package edu.cnm.deepdive.animals;

public class Wolf extends Canis {

  static {
    System.out.println("Wolf static initialization");
  }

  {
    System.out.println("Wolf instance initialization");
  }

  public Wolf() {
    System.out.println("Wolf constructor prologue");
    super();
    System.out.println("Wolf constructor epilogue");
  }

  @Override
  public void vocalize() {
    System.out.println("Howl to communicate");
  }

  @Override
  public void hunt() {
    System.out.println("Hunt in packs for live prey");
  }

  public static void identify() {
    System.out.println("I am a wolf");
  }

}
