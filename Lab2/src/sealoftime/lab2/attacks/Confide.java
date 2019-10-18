package sealoftime.lab2.attacks;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove{
	public Confide(){
		super(Type.NORMAL, 0, 100);
	}
	@Override
	public void applyOppEffects(Pokemon p){
		p.addEffect(new Effect()
			.turns(-1)
			.stat(Stat.SPECIAL_ATTACK, -1)
		);
	}
	@Override
	public String describe(){
		return MoveMessages.getStr("confide");
	}
}