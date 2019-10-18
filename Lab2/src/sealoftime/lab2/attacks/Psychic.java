package sealoftime.lab2.attacks;

import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove{
	public Psychic(){
		super(Type.PSYCHIC, 90, 100);
	}
	public void applyOppEffects(Pokemon p){
		p.addEffect(new Effect()
			.chance(0.1)
			.turns(0)
			.stat(Stat.SPECIAL_ATTACK, -1)
		);
	}
	@Override
	public String describe(){
		return MoveMessages.getStr("psychic"));
	}
}