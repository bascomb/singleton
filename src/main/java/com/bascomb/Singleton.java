package com.bascomb;

//A Singleton
public class Singleton {
    public String str;
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
