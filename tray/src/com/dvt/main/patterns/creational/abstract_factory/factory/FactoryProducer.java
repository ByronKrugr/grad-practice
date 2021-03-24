package patterns.creational.abstract_factory.factory;

public class FactoryProducer {
    public static StampingEquipmentFactory getFactory(String factoryType) throws Exception{
        return switch (factoryType) {
            case "MODEL1" -> new Model1Factory();
            case "MODEL2" -> new Model2Factory();
            default -> throw new Exception("Error! Model not found");
        };
    }
}
