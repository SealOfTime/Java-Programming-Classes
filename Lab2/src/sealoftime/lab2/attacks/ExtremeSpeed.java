package sealoftime.lab2.attacks;

import ru.ifmo.se.pokemon.*;

public class ExtremeSpeed extends PhysicalMove{
	public ExtremeSpeed(){
		super(Type.NORMAL, 80, 100, 2,1);
	}
	@Override
	public String describe(){
		return String.format("charges itself at blinding speed. This move always goes first.");
	}
}