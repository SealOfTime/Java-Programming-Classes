package sealoftime.lab2.attacks;

import ru.ifmo.se.pokemon.*;
  
public class SwordsDance extends StatusMove{
	public SwordsDance(){
		super(Type.NORMAL, 0, 100);
	}
	@Override
	public void applySelfEffects(Pokemon p){
		p.addEffect(new Effect()
			.turns(-1)
			.stat(Stat.ATTACK, 2)
		);
	}
	@Override
	public String describe(){
		return MoveMessages.getStr("swordsDance");
	}
}