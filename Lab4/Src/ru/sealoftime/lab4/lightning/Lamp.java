package ru.sealoftime.lab4.lightning;

import ru.sealoftime.lab4.lightning.Lightning;
import ru.sealoftime.lab4.lightning.LightsPower;

public class Lamp implements Lightning {
    private String type;
    private LightsPower strength;

    public Lamp(String type, LightsPower strength){
        this.type = type;
        this.strength = strength;
    }
    public String getType(){
        return this.type;
    }
    @Override
    public LightsPower getStrength(){
        return this.strength;
    }
    @Override
    public String toString() {
    	return "Лампа";
    }
	@Override 
	public int hashCode(){
		int hash = 1;
		hash = hash*31 + type.hashCode();
		hash = hash*31 + strength.hashCode();
		return hash;
	}
	@Override
	public boolean equals(Object obj){
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		Lamp o = (Lamp) obj;
		if(!type.equals(o.type) || strength != o.strength) return false;
		return true;
	}
}