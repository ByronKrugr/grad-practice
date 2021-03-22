package com.dvt.creational.abstract_factory.factory;

import com.dvt.creational.abstract_factory.Part;

public interface StampingEquipmentFactory {
    Part stampPart(String partType);
}
