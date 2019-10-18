package sealoftime.lab2.attacks;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove{
	public Confide(){
		super(Type.NORMAL, 0, 100);
	}
	@Override
	public void applyOppEffects(Pokemon p){
		p.addEffect(new Effect()
			.stat(Stat.SPECIAL_ATTACK, -1)
		);
	}
	@Override
	public String describe(){
		return "tells the target a secret, and the target loses its ability to concentrate. This lowers the target’s Sp. Atk stat.";
	}
}