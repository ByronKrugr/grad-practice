<<<<<<< HEAD
package com.dvt.creational.singleton;
=======
package creational.singleton;
>>>>>>> main

public class Client {
    public static void main(String[] args) {
        Database db = Database.getInstance();
        Database db2 = Database.getInstance();

        System.out.println(db == db2);
    }
}
