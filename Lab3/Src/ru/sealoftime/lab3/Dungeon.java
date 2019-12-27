package ru.sealoftime.lab3;

import ru.sealoftime.lab3.actors.Actor;
import ru.sealoftime.lab3.lightning.Lightning;

public class Dungeon {
    private String height;
    private int length;
    private int width;
    private Lightning lightning;
    private Actor[][] map;

    public Dungeon(Lightning lightning, String height, int length, int width){
        this.lightning = lightning;
        this.height = height;
        this.length = length;
        this.width = width;
        this.map = new Actor[width][length];
    }
    public void moveActor(Actor actor, int x, int y){

    }

    public void addActor(Actor actor, int x, int y){
        if(this.map[x][y] == null){
            this.map[x][y] = actor;
            actor.setX(x)
                 .setY(y)
                 .assignDungeon(this);
        }
    }

    public Actor getActor(int x, int y){
        return this.map[x][y];
    }

    public Lightning getLightning() {
        return lightning;
    }

    public String getHeight(){
        return height;
    }

    public int getLength(){
        return length;
    }

    public int getWidth() {
        return width;
    }
}
