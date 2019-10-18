package sealoftime.lab2.attacks;

import ru.ifmo.se.pokemon.*;

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
		return "uses a life-risking tackle that also hurts the user.";
	}
}