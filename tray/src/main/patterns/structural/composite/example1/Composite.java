package patterns.structural.composite.example1;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Composite implements Parcel {
  private List<Parcel> components = new ArrayList<>();
  private double totalCost = 0;

  public void add(Parcel... components) {
    this.components.addAll(asList(components));
  }

  public void remove(Parcel... components) {
    this.components.removeAll(asList(components));
  }

  @Override
  public double getCost() {
    for (Parcel component : components)
      totalCost += component.getCost();
    return totalCost;
  }
}
