package ru.sealoftime.lab3.actors;

public class Alice extends Actor{
    private List<Item> inventory;
    private Mood mood;
    private String lastThought;

    public boolean interact(Interactable object){
    }

    public boolean step(int x, int y){
        int currentX = this.getX(),
            currentY = this.getY();
        while(x > 0 && y > 0){
            int xSign = x > 0 ? 1 : x < 0 ? -1 : 0,
                ySign = y > 0 ? 1 : y < 0 ? -1 : 0;
            Actor actorNextToX = this.getDungeon().getActor(currentX + xSign, currentY);
            if(actorNextToX == null){
                currentX += xSign;
            }
        }
        return false;
    }
    public boolean step(int x, int y, Mood mood){
        this.mood = mood;
        return step(x,y);
    }
}
