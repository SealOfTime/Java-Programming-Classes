package sealoftime.lab2.pokemons;

import sealoftime.lab2.attacks.ExtremeSpeed;

public class Togekiss extends Togetic{
	
	public Togekiss(String name, int level){
		super(name, level);
		this.addMove(new ExtremeSpeed());
		/*
		Задаю базовые значения характеристик покемона в порядке
		(HP, ATT, DEF, ATT Speed, DEF Speed, SPEED)
		@see ru.ifmo.se.pokemon.Pokemon#setStats			
		*/
		this.setStats(
			85.0d,
			50.0d,
			95.0d,
			120.0d,
			115.0d,
			80.0d
		);
	}
	public Togekiss(){
		this("Togekiss", 1);
	}
}