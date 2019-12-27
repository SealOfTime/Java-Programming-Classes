package ru.sealoftime.lab3.lightning;

public enum LightsPower {
    NONE("никак", 0),
    LOW("слабо", 1),
    MEDIUM("нормально", 2),
    HIGH("ярко", 3),
    BLINDING("ослепительно", 4);

    public final String name;
    public final int value;
    LightsPower(String name, int value){
        this.name = name;
        this.value = value;
    }
}
