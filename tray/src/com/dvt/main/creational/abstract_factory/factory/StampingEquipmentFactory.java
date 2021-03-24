package creational.abstract_factory.factory;

import creational.abstract_factory.Part;

public interface StampingEquipmentFactory {
    Part stampPart(String partType);
}
