package edu.cnm.deepdive.animals;

public class Main {

  void main() {
    Canis c = new Wolf();
    c.identify();

    c.vocalize();
    c.hunt();

    Wolf d = new Wolf();
    d.identify();

    Canis coyote = new Coyote(1);
//    Coyote.identify();
  }

}
