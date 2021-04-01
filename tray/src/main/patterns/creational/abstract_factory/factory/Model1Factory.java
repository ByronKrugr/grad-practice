package patterns.creational.abstract_factory.factory;

import patterns.creational.abstract_factory.Part;
import patterns.creational.abstract_factory.doors.Model1Doors;
import patterns.creational.abstract_factory.hood.Model1Hood;
import patterns.creational.abstract_factory.wheels.Model1Wheels;

public class Model1Factory implements StampingEquipmentFactory {
  @Override
  public Part stampPart(String partType) {
    return switch (partType) {
      case "WHEELS" -> makeWheels();
      case "DOORS" -> makeDoors();
      case "HOOD" -> makeHood();
      default -> null;
    };
  }

  public Part makeWheels() {
    return new Model1Wheels();
  }

  public Part makeDoors() {
    return new Model1Doors();
  }

  public Part makeHood() {
    return new Model1Hood();
  }
}
