package com.designpatterns.dp;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SimplePrinter implements Printer{

    @Override
    public String toString(ArrayList<String> list) {
        String output = "";
        int i = 0;
        for (String e: list) {
            i += 1;
            output += i + " " + e + "\n";
        }
        return output;
    }

}
