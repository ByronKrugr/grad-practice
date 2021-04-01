package com.designpatterns.dp;

import java.util.ArrayList;

public class PrettyPrinter implements Printer {
  private final Printer decorated;

  public PrettyPrinter(Printer decorated) {
    this.decorated = decorated;
  }

  @Override
  public String toString(ArrayList<String> list) {
    String output = "";
    String simple = decorated.toString();
    System.out.println("simple");
    System.out.println(simple);
    String parts[] = simple.split("\n");
    System.out.println(parts);
//        System.out.println(parts[0]);
//        System.out.println(parts[1]);
    for (String e : parts) {
      output += e.toString() + "\n";
      output += ":::::::::::::::::::::::::::::";
    }
    return output;
  }
}
