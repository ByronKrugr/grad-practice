package com.dvt.creational.abstract_factory.hood;

import com.dvt.creational.abstract_factory.Part;

public class Model2Hood implements Part {
    @Override
    public void stamp() {
        System.out.println("Model 2 hood stamped");
    }
}
