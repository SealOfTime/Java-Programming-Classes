package ru.sealoftime.lab4.actors;

import ru.sealoftime.lab4.Interactable;
import ru.sealoftime.lab4.Item;
import ru.sealoftime.lab4.Dungeon.SpotOccupiedException;

public class Curtain extends Actor implements Interactable {
    private String height;
	private Actor whatsBehind;
    public Curtain(String height, Actor whatIsBehind){
        this.height = height;
		this.whatsBehind = whatIsBehind;
    }

    public String getHeight() {
        return height;
    }

    @Override
    public boolean interact() {    	
		try{
			this.getDungeon().addActor(whatsBehind, this.getX(), this.getY());
		}catch(SpotOccupiedException e){
			this.getDungeon().removeActor(this);
			try{
				this.getDungeon().addActor(whatsBehind, this.getX(), this.getY());
			} catch(SpotOccupiedException eInner){
				eInner.printStackTrace();
			}
		}
		System.out.println("А за шторой было скрыто: " + whatsBehind);
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