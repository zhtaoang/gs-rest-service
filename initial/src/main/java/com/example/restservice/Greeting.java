package com.example.restservice;

public class Greeting {

    private final long count;
    private final String name;

    public Greeting(long count, String name) {
        this.count = count;
        this.name = name;
    }

    public long getCount() {
        return count;
    }

    public String getName() {
        return name;
    }
}
