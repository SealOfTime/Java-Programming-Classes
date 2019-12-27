package ru.sealoftime.lab3.actors;

import ru.sealoftime.lab3.Interactable;
import ru.sealoftime.lab3.Item;

public class Curtain extends Actor implements Interactable {
    private String height;

    public Curtain(String height){
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    @Override
    public boolean interact() {
        return true;
    }

    @Override
    public boolean interact(Item item) {
        return false;
    }
}
