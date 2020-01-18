package ru.sealoftime.lab4.lightning;

import java.util.ArrayList;
import java.util.List;


public class RowOfLamps implements Lightning {
    private List<Lamp> lamps = new ArrayList<Lamp>();

    @Override
    public LightsPower getStrength(){
		try{
			return lamps.stream()
						.map((l) -> l.getStrength())
						.max(
							(prev, next) -> next.value - prev.value
						)
						.get();
		}catch(NullPointerException e){
			throw new NoLightsException(this, e);
		}
    }

    public RowOfLamps addLamp(Lamp lamp){
        this.lamps.add(lamp);
        return this;
    }
    public boolean removeLamp(Lamp lamp){
        return lamps.remove(lamp);
    }
    @Override 
    public String toString() {
    	return "ряд одиноко висящих ламп";
    }
	@Override
	public int hashCode(){
		return lamps.stream()
				    .map((l) -> l.hashCode())
					.reduce(1, (hash, el) -> hash*31 + el);
	}
	@Override
	public boolean equals(Object obj){
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		RowOfLamps o = (RowOfLamps) obj;
		if(!lamps.equals(o.lamps))return false;
		return true;
	}
}