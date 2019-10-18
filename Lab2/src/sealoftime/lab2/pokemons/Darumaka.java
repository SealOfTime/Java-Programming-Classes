package sealoftime.lab2.pokemons;

import ru.ifmo.se.pokemon.*;
import sealoftime.lab2.attacks.*;

public class Darumaka extends Pokemon{
	
		public Darumaka(){
			super("Darumaka", 1);
			this.addType(Type.FIRE);
			this.addMove(new Flamethrower());
			this.addMove(new FirePunch());
			this.addMove(new Confide());
			/*
			Задаю базовые значения характеристик покемона в порядке
			(HP, ATT, DEF, ATT Speed, DEF Speed, SPEED)
			@see ru.ifmo.se.pokemon.Pokemon#setStats
			*/
			this.setStats(
				70.0d,
				90.0d,
				45.0d,
				15.0d,
				45.0d,
				50.0d
			);
		}
}