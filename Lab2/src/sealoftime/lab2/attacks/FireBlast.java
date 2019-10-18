package sealoftime.lab2.attacks;

import ru.ifmo.se.pokemon.*;

public class FireBlast extends SpecialMove{
	public FireBlast(){
		super(Type.FIRE, 110, 85);
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
		return "uses a fiery blast that scorches all. May cause a burn.";
	}
}