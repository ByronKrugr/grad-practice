<<<<<<< HEAD
package com.dvt.creational.singleton;
=======
package creational.singleton;
>>>>>>> main

public class Database {
    private static Database db = null;

    private Database() {
    }

    public static Database getInstance(){
        if (db == null)
            db = new Database();
        return db;
    }
}
