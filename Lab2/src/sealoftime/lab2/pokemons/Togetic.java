package sealoftime.lab2.pokemons;

import ru.ifmo.se.pokemon.*;
import sealoftime.lab2.attacks.DoubleEdge;

public class Togetic extends Togepi{
	
	public Togetic(String name, int level){
		super(name, level);
		this.addType(Type.FLYING);
		this.addMove(new DoubleEdge());
		/*
		Задаю базовые значения характеристик покемона в порядке
		(HP, ATT, DEF, ATT Speed, DEF Speed, SPEED)
		@see ru.ifmo.se.pokemon.Pokemon#setStats			
		*/
		this.setStats(
			55.0d,
			40.0d,
			85.0d,
			80.0d,
			105.0d,
			40.0d
		);
	}
	
	public Togetic(){
		this("Togetic", 1);
	}
}