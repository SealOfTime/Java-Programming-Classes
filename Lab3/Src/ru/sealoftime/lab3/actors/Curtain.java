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
    	this.getDungeon().removeActor(this);
        return true;
    }

    @Override
    public boolean interact(Item item) {
        return false;
    }
    
    @Override
    public String toString() {
    	return "Штора " + this.getHeight();
    }
	
	@Override
	public boolean equals(Object obj){
		if(!super.equals(obj)) return false;
		if(!this.height.equals(((Curtain)obj).height)) return false;
		return true;
	}
	@Override
	public int hashCode(){
		int hash = super.hashCode();
		hash = hash*31 + height.hashCode();
		return hash;
	}
}