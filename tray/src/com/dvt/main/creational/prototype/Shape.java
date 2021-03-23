<<<<<<< HEAD
package com.dvt.creational.prototype;
=======
package creational.prototype;
>>>>>>> main

public abstract class Shape {
    protected String color;

    public Shape() {
    }

    public Shape(Shape source) {
        this.color = source.color;
    }

    public abstract Shape clone();
}
