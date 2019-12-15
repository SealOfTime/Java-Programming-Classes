package ru.sealoftime.lab3.actors;

import ru.sealoftime.lab3.Dungeon;

public abstract class Actor {
    private int x;
    private int y;
    private Dungeon dungeon;

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public Dungeon getDungeon(){
        return this.dungeon;
    }
    public Actor setX(int x){
        this.x = x;
        return this;
    }
    public Actor setY(int y){
        this.y = y;
        return this;
    }
    public Actor assignDungeon(Dungeon dungeon){
        this.dungeon = dungeon;
        return this;
    }
}
