package com.dvt.creational.abstract_factory.wheels;

import com.dvt.creational.abstract_factory.Part;

public class Model1Wheels implements Part {
    @Override
    public void stamp() {
        System.out.println("Model 1 wheels stamped");
    }
}
