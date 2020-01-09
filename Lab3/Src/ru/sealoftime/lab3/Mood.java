package ru.sealoftime.lab3;

public enum Mood {
    SAD("Уныло"),
    HAPPY("Весело"),
    DEFAULT("ПСЖ");

    public String name;
    Mood(String name){
        this.name = name;
    }
    @Override
    public String toString(){return name;}
}