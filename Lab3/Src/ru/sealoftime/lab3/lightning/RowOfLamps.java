package ru.sealoftime.lab3.lightning;

import java.util.ArrayList;
import java.util.List;

public class RowOfLamps implements Lightning {
    private List<Lamp> lamps = new ArrayList<Lamp>();

    @Override
    public LightsPower getStrength(){
        return lamps.stream()
                    .map((l) -> l.getStrength())
                    .max(
                        (prev, next) -> next.value - prev.value
                    )
                    .get();
    }

    public void addLamp(Lamp lamp){
        this.lamps.add(lamp);
    }
    public boolean removeLamp(Lamp lamp){
        return lamps.remove(lamp);
    }

}
