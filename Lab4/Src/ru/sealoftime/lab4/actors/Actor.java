package ru.sealoftime.lab4.actors;

import ru.sealoftime.lab4.Dungeon;

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
	@Override
	public String toString(){
		return "Вся жизнь театр, а мы в ней " + getClass().getSimpleName();
	}
	
	@Override
	public boolean equals(Object obj){
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		Actor o = (Actor) obj;
		if(this.x != o.getX() || this.y != o.getY() || !this.dungeon.equals(o.getDungeon())) return false;
		return true;
	}
	
	@Override
	public int hashCode(){
		int hash = 1;
		hash = hash*31 + x;
		hash = hash*31 + y;
		//hash = hash*31 + dungeon.hashCode(); не имеет значения, т.к. в основном Dungeon для всех один, а соответственно влияние на Hash будет равным для всех актёров
		return hash;
	}
}