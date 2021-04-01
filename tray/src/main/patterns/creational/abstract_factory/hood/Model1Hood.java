package patterns.creational.abstract_factory.hood;

import patterns.creational.abstract_factory.Part;

public class Model1Hood implements Part {
  @Override
  public void stamp() {
    System.out.println("Model 1 hood stamped");
  }
}
