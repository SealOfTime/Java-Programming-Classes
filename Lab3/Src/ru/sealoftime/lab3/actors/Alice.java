package ru.sealoftime.lab3.actors;

import ru.sealoftime.lab3.Interactable;
import ru.sealoftime.lab3.Item;
import ru.sealoftime.lab3.Mood;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Alice extends Actor{
    private List<Item> inventory;
    private Mood mood;
    private String lastThought;

    public Alice(){
        inventory = new ArrayList<Item>();
        mood = Mood.DEFAULT;
        lastThought = "я упал";
    }
    public boolean interact(Interactable object){
        for(Item item : inventory){
            if(object.interact(item)){
                inventory.remove(item);
                return true;
            }
        }
        return object.interact();
    }
    //TODO: Actually make it
    public boolean step(int x, int y){
        int currentX = this.getX(),
            currentY = this.getY();
        while(x > 0 && y > 0){
            int xSign = x > 0 ? 1 : x < 0 ? -1 : 0,
                ySign = y > 0 ? 1 : y < 0 ? -1 : 0;
            Actor actorNextToX = this.getDungeon().getActor(currentX + xSign, currentY);
            if(actorNextToX == null){
                currentX += xSign;
                x-=1;
            }
        }
        return false;
    }
    public boolean step(int x, int y, Mood mood){
        this.mood = mood;
        return step(x,y);
    }

    public String getLastThought() {
        return lastThought;
    }
    public Mood getMood() {
        return mood;
    }
}
