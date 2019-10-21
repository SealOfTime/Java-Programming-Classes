package sealoftime.lab2.attacks;

import ru.ifmo.se.pokemon.*;
import sealoftime.lab2.MoveMessages;

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
		return MoveMessages.getStr("focusBlast");
	}
}