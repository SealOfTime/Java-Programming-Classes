package ru.sealoftime.lab3.actors;

import ru.sealoftime.lab3.Interactable;
import ru.sealoftime.lab3.Item;

public class Door extends Actor implements Interactable {
    private boolean closed = true;
    private Item lock;
    public Door(Item item){
        this.lock = item;
    }

    public boolean isOpen(){
        return !closed;
    }
    @Override
    public boolean interact() {
        return false;
    }

    @Override
    public boolean interact(Item item) {
    	if(item.getSize() == this.lock.getSize()) {
    		this.closed = !this.closed;
    		return true;
    	}
    	return false;
    }
    
    @Override
    public String toString() {
    	return "Дверь " + (this.isOpen() ? "открыта" : "закрыта");
    }
	
	@Override
	public boolean equals(Object obj){
		if(!super.equals(obj)) return false;
		Door o = (Door) obj;
		if(this.closed != o.closed || !this.lock.equals(o.lock)) return false;
		return true;
	}
	@Override
	public int hashCode(){
		int hash = super.hashCode();
		hash = hash*31 + (closed?1:0);
		hash = hash*31 + lock.hashCode();
		return hash;
	}
    @Override
    public Door clone() {
    	return new Door(this.lock.clone());
    }
}