package patterns.creational.abstract_factory.factory;

import patterns.creational.abstract_factory.Part;

public interface StampingEquipmentFactory {
  Part stampPart(String partType);
}
