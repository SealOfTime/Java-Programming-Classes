package ru.sealoftime.lab3;

public enum Size {
    PETITE("Крохотный"), 
    SMALL("Маленький"), 
    BIG("Большой");

    private final String name;
    Size(String name) {
        this.name = name;
    }
    @Override
    public String toString(){return name;}
}