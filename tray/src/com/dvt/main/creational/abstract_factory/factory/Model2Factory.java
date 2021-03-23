<<<<<<< HEAD
package com.dvt.creational.abstract_factory.factory;

import com.dvt.creational.abstract_factory.Part;
import com.dvt.creational.abstract_factory.doors.Model2Doors;
import com.dvt.creational.abstract_factory.hood.Model2Hood;
import com.dvt.creational.abstract_factory.wheels.Model2Wheels;
=======
package creational.abstract_factory.factory;

import creational.abstract_factory.Part;
import creational.abstract_factory.doors.Model2Doors;
import creational.abstract_factory.hood.Model2Hood;
import creational.abstract_factory.wheels.Model2Wheels;
>>>>>>> main

public class Model2Factory implements StampingEquipmentFactory {
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
        return new Model2Wheels();
    }

    public Part makeDoors() {
        return new Model2Doors();
    }

    public Part makeHood() {
        return new Model2Hood();
    }
}