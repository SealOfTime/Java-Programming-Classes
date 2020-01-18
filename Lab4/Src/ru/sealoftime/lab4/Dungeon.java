package ru.sealoftime.lab4;

import ru.sealoftime.lab4.actors.Actor;
import ru.sealoftime.lab4.lightning.Lightning;
import java.util.Arrays;

public class Dungeon {
    private String height;
    private int length;
    private int width;
    private Lightning lightning;
    private Actor[][] map;

    public Dungeon(Lightning lightning, String height, int width, int length){
        this.lightning = lightning;
        this.height = height;
        this.length = length;
        this.width = width;
        this.map = new Actor[width][length];
    }
    public void moveActor(Actor actor, int x, int y) throws SpotOccupiedException{
		try{
			if(this.map[x][y] == null){
				this.map[actor.getX()][actor.getY()] = null;
				this.map[x][y] = actor;
				actor.setX(x).setY(y);
			} else throw new SpotOccupiedException(this.map[x][y]);
		}catch(IndexOutOfBoundsException e){
			Dungeon.ActorOutOfBoundsException aob = new Dungeon.ActorOutOfBoundsException(actor);
			aob.initCause(e);
			throw aob;
		}
    }
   
    public void addActor(Actor actor, int x, int y) throws SpotOccupiedException{
		try{
			if(this.map[x][y] == null){
				this.map[x][y] = actor;
				actor.setX(x)
					 .setY(y)
					 .assignDungeon(this);
			} else throw new SpotOccupiedException(this.map[x][y]);
		}catch(IndexOutOfBoundsException e){
			Dungeon.ActorOutOfBoundsException aob = new Dungeon.ActorOutOfBoundsException(actor);
			aob.initCause(e);
			throw aob;
		}
    }
    
    public void removeActor(Actor actor) {
    	this.map[actor.getX()][actor.getY()] = null;
    }
    
    @Override
    public String toString() {
    	return this.height  + 
    			" Подземелье освещалось " + this.lightning.toString();
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
	
	@Override
	public boolean equals(Object obj){
		if(!super.equals(obj)) return false;
		Dungeon theD = (Dungeon) obj;
		if(!this.height.equals(theD.height) || 
			this.length != theD.length || 
			this.width != theD.width ||
			!this.lightning.equals(theD.lightning) ||
			!Arrays.equals(map, theD.map)) return false;
		return true;
	}
	@Override
	public int hashCode(){
		int hash = 1;
		hash = hash* 31 + height.hashCode();
		hash = hash* 31 + lightning.hashCode();
		hash = hash* 31 + Arrays.hashCode(map);
		hash = hash* 31 + length;
		hash = hash* 31 + width;
		return hash;
	}
	public class ActorOutOfBoundsException extends RuntimeException{
		private Actor which;
		ActorOutOfBoundsException(Actor which){
			this.which = which;
		}
		public Actor which(){
			return this.which;
		}
	}
	public class SpotOccupiedException extends Exception{
		private Actor byWhat;
		SpotOccupiedException(Actor byWhat){
			this.byWhat = byWhat;
		}
		public Actor occupiedBy(){
			return byWhat;
		}
	}
}
