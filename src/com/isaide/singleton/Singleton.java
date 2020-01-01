package com.isaide.singleton;

public class Singleton {
    /**
     * 方式一
     */
    private static Singleton instance = null;
    public static synchronized Singleton getInstance() {
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
}
