package sealoftime.lab2.pokemons;

import ru.ifmo.se.pokemon.*;
import sealoftime.lab2.attacks.FocusBlast;
public class Darmanitan extends Darumaka{
	
		public Darmanitan(String name, int level){
			super(name, level);
			this.addMove(new FocusBlast());
			/*
			Задаю базовые значения характеристик покемона в порядке
			(HP, ATT, DEF, ATT Speed, DEF Speed, SPEED)
			@see ru.ifmo.se.pokemon.Pokemon#setStats
			*/
			this.setStats(
				105.0d,
				140.0d,
				55.0d,
				30.0d,
				55.0d,
				95.0d
			);
		}
		
		public Darmanitan(){
			this("Darmanitan", 1);
		}
}