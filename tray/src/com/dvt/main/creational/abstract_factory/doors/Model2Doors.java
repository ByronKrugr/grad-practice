package creational.abstract_factory.doors;

import creational.abstract_factory.Part;

public class Model2Doors implements Part {
    @Override
    public void stamp() {
        System.out.println("Model 2 doors stamped");
    }
}
