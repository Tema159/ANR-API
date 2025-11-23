package me.tema159.ANR;

public class Anr {
    private static volatile Api instance;

    private Anr() {}

    public static Api get() {
        if (instance == null) {
            throw new IllegalStateException("API implementation not initialized");
        }
        return instance;
    }

    public static void setImplementation(Api impl) {
        if (impl == null) throw new NullPointerException("impl");
        if (instance != null) throw new IllegalStateException("already initialized");
        instance = impl;
    }
}
