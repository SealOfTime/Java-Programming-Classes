package sealoftime.lab2.attacks;

import ru.ifmo.se.pokemon.*;
import sealoftime.lab2.MoveMessages;
  
public class SwordsDance extends StatusMove{
	public SwordsDance(){
		super(Type.NORMAL, 0, 100);
	}
	@Override
	public void applySelfEffects(Pokemon p){
		p.addEffect(new Effect()
			.turns(0)
			.stat(Stat.ATTACK, 2)
		);
	}
	@Override
	public String describe(){
		return MoveMessages.getStr("swordsDance");
	}
}