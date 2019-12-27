package ru.sealoftime.lab3;

public enum Mood {
    SAD("уныло"),
    HAPPY("весело"),
    DEFAULT("ПСЖ");

    public String name;
    Mood(String name){
        this.name = name;
    }
}
