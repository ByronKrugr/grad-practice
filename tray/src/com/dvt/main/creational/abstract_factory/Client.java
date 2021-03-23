<<<<<<< HEAD
package com.dvt.creational.abstract_factory;

import com.dvt.creational.abstract_factory.factory.FactoryProducer;
import com.dvt.creational.abstract_factory.factory.StampingEquipmentFactory;
=======
package creational.abstract_factory;

import creational.abstract_factory.factory.FactoryProducer;
import creational.abstract_factory.factory.StampingEquipmentFactory;
>>>>>>> main

public class Client {
    private static StampingEquipmentFactory factory;

    public static void main(String[] args) throws Exception {
        factory = FactoryProducer.getFactory("MODEL1");
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
