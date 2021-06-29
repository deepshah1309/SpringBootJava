package com.example.restservice;

public class Greeting {
    private final long id;
    private final String text;

    public Greeting(long id, String text) {
        this.id = id;
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}
