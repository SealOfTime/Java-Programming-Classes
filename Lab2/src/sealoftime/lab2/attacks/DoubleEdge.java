package sealoftime.lab2.attacks;

import ru.ifmo.se.pokemon.*;
import sealoftime.lab2.MoveMessages;

public class DoubleEdge extends PhysicalMove{
	public DoubleEdge(){
		super(Type.NORMAL, 120, 100);
	}
	@Override
	public void applySelfDamage(Pokemon att, double damage){
		att.setMod(Stat.HP, (int) Math.round(damage/3));
	}
	@Override
	public String describe(){
		return MoveMessages.getStr("doubleEdge");
	}
}