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
        lastThought = "Эх щяс бы тяночку";
    }
    
    public List<Interactable> lookAround(){
    	Actor left = this.getDungeon().getActor(this.getX() - 1, this.getY());
    	Actor top = this.getDungeon().getActor(this.getX(), this.getY()-1);
    	Actor right = this.getDungeon().getActor(this.getX() + 1, this.getY());
    	Actor bottom = this.getDungeon().getActor(this.getX(), this.getY()+1);
    	List<Interactable> res = new ArrayList<Interactable>();
    	if(left instanceof Interactable) res.add((Interactable)left);
    	if(top instanceof Interactable) res.add((Interactable)top);
    	if(right instanceof Interactable) res.add((Interactable)right);
    	if(bottom instanceof Interactable) res.add((Interactable)bottom);
    	return res;
    }
    public void giveItem(Item item) {
    	if(item.getName() == "ключик") {
    		this.mood = Mood.HAPPY;
    		this.lastThought = "Наверное, он от двери";
    	}
    	this.inventory.add(item);
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
    //TODO: Actually make it good
    public boolean step(int x, int y){
        int currentX = this.getX();
        this.getDungeon().moveActor(this, x, y);
        return true;
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
    
    @Override
    public String toString() {
    	return "Алиса";
    }
	
	@Override
	public boolean equals(Object obj){
		if(!super.equals(obj)) return false;
		Alice a = (Alice) obj;
		if(!inventory.equals(a.inventory) || mood != a.mood || !lastThought.equals(a.lastThought)) return false;
		return true;
	}
	
	@Override
	public int hashCode(){
		int hash = super.hashCode();
		hash = hash*31 + inventory.hashCode();
		hash = hash*31 + mood.hashCode();
		hash = hash*31 + lastThought.hashCode();
		//hash = hash*31 + dungeon.hashCode();
		return hash;
	}
}