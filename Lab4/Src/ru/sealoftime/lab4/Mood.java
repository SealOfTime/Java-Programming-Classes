package ru.sealoftime.lab4;

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