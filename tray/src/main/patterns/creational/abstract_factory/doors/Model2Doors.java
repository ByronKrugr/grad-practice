package patterns.creational.abstract_factory.doors;

import patterns.creational.abstract_factory.Part;

public class Model2Doors implements Part {
  @Override
  public void stamp() {
    System.out.println("Model 2 doors stamped");
  }
}
