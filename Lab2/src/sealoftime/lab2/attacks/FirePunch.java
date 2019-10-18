package sealoftime.lab2.attacks;

import ru.ifmo.se.pokemon.*;

public class FirePunch extends PhysicalMove{
	public FirePunch(){
		super(Type.FIRE, 75, 100);
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
		return MoveMessages.getStr("firePunch");
	}
}