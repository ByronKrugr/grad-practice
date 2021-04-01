package patterns.creational.abstract_factory.doors;

import patterns.creational.abstract_factory.Part;

public class Model1Doors implements Part {
  @Override
  public void stamp() {
    System.out.println("Model 1 doors stamped");
  }
}
