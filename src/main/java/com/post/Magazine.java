package com.post;

public enum Magazine {
    NEWS("NEWS"),
    FASHION("FASHION"),
    COOKING("COOKING");

    private final String name;

    Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}