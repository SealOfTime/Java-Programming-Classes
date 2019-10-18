package sealoftime.lab2.attacks;

import ru.ifmo.se.pokemon.*;

public class Flamethrower extends SpecialMove{
	public Flamethrower(){
		super(Type.FIRE, 90, 100);
	}
	
	@Override
	public void applyOppEffects(Pokemon p){
		p.addEffect(new Effect()
			.chance(0.1)
			.turns(0)
			.condition(Status.BURN)
		);
	}
	@Override
	public String describe(){
		return "uses a powerful fire attack that may inflict a burn.";
	}
}