package sealoftime.lab2.attacks;

import ru.ifmo.se.pokemon.*;
import sealoftime.lab2.MoveMessages;

public class Facade extends PhysicalMove{
	public Facade(){
		super(Type.FIRE, 70, 100);
	}
	
	@Override
	public double calcBaseDamage(Pokemon att, Pokemon def){
		Status attStatus = att.getCondition();
		switch(attStatus){
			case POISON:
			case PARALYZE:
			case BURN:
				return super.calcBaseDamage(att, def)*2.0D;
			default:
				return super.calcBaseDamage(att, def);
		}
	}
	
	@Override 
	public String describe(){
		return MoveMessages.getStr("facade");
	}
}