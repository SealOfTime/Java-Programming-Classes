package sealoftime.lab2.attacks;

import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove{
	public FocusBlast(){
		super(Type.FIGHTING, 120, 70);
	}
	
	@Override
	public void applyOppEffects(Pokemon p){
		p.addEffect(new Effect()
			.chance(0.1)
			.turns(0)
			.stat(Stat.SPECIAL_DEFENSE, -1)
		);
	}
	@Override
	public String describe(){
		return "heightens its mental focus and unleashes its power. This may also lower the target’s Sp. Def stat.";
	}
}