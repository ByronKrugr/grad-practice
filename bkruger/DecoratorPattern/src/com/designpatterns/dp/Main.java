package com.designpatterns.dp;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    SimplePrinter sp = new SimplePrinter();
    ArrayList<String> list = new ArrayList<>(Arrays.asList("Vincent", "Taylor", "Ruben", "Abdullah", "Justine", "Junaid", "Ruan", "Cain", "Byron"));
    System.out.println(sp.toString(list));

    PrettyPrinter pp = new PrettyPrinter(sp);
    System.out.println(pp.toString(list));

    String a = "hello\nworld!";
    String as[] = a.split("\n");
    System.out.println(as[0]);
    System.out.println(as[1]);
  }
}
