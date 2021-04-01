package patterns.creational.abstract_factory.factory;

public final class FactoryProducer {

  private FactoryProducer(){
  }

  public static StampingEquipmentFactory getFactory(String factoryType) throws IllegalStateException {
    return switch (factoryType) {
      case "MODEL1" -> new Model1Factory();
      case "MODEL2" -> new Model2Factory();
      default -> throw new IllegalStateException("Error! Model not found");
    };
  }
}
