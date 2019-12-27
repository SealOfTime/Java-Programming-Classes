package ru.sealoftime.lab3.lightning;

import ru.sealoftime.lab3.lightning.Lightning;
import ru.sealoftime.lab3.lightning.LightsPower;

public class Lamp implements Lightning {
    private String type;
    private LightsPower strength;

    public Lamp(String type, LightsPower strength){
        this.type = type;
        this.strength = strength;
    }
    public String getType(){
        return this.type;
    }
    @Override
    public LightsPower getStrength(){
        return this.strength;
    }
}
