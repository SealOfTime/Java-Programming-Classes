package ru.sealoftime.lab3;

public enum Size {
    PETITE("крохотный"), SMALL("маленький"), BIG("большой");

    private final String name;
    Size(String name) {
        this.name = name;
    }
    @Override
    public String toString(){return name;}
}
