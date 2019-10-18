package sealoftime.lab2.attacks;

import ru.ifmo.se.pokemon.*;

public class Screech extends StatusMove{
	public Screech(){
		super(Type.NORMAL, 0, 85);
	}
	
	@Override
	public void applyOppEffects(Pokemon p){
		p.addEffect(new Effect()
			.turns(0)
			.stat(Stat.DEFENSE, -2)
		);
	}
	
	@Override
	public String describe(){
		return "emits a screech to sharply reduce the foe’s DEFENSE.";
	}
}