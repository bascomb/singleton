package com.bascomb;

//A Singleton
public class Singleton {
    private static Singleton s;

    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        if (s == null) {
            s = new Singleton();
        }
        return s;
    }


}
