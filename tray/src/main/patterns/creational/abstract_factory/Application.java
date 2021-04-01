package patterns.creational.abstract_factory;

import patterns.creational.abstract_factory.factory.FactoryProducer;
import patterns.creational.abstract_factory.factory.StampingEquipmentFactory;

public class Application {
  public static void main(String[] args) throws Exception {
    StampingEquipmentFactory factory = FactoryProducer.getFactory("MODEL1");
    Part wheels = factory.stampPart("WHEELS");
    wheels.stamp();

    Part hood = factory.stampPart("HOOD");
    hood.stamp();

    Part doors = factory.stampPart("DOORS");
    doors.stamp();

    factory = FactoryProducer.getFactory("MODEL2");
    Part wheels2 = factory.stampPart("WHEELS");
    wheels2.stamp();

    Part hood2 = factory.stampPart("HOOD");
    hood2.stamp();

    Part doors2 = factory.stampPart("DOORS");
    doors2.stamp();
  }
}
