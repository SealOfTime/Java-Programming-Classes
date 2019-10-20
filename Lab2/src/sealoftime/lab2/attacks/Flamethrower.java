package sealoftime.lab2.attacks;

import ru.ifmo.se.pokemon.*;
import sealoftime.lab2.MoveMessages;

public class Flamethrower extends SpecialMove{
	public Flamethrower(){
		super(Type.FIRE, 90, 100);
	}
	
	@Override
	public void applyOppEffects(Pokemon p){
		p.addEffect(new Effect()
			.chance(0.1)
			.turns(-1)
			.condition(Status.BURN)
		);
	}
	@Override
	public String describe(){
		return MoveMessages.getStr("flamethrower");
	}
}