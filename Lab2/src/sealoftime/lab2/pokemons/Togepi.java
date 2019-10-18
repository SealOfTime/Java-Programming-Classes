package sealoftime.lab2.pokemons;

import ru.ifmo.se.pokemon.*;
import sealoftime.lab2.attacks.Facade;
import sealoftime.lab2.attacks.FireBlast;
public class Togepi extends Pokemon{
			
		public Togepi(String name, int level){
			super(name, level);
			this.addType(Type.FAIRY);
			this.addMove(new Facade());
			this.addMove(new FireBlast());
			/*
			Задаю базовые значения характеристик покемона в порядке
			(HP, ATT, DEF, ATT Speed, DEF Speed, SPEED)
			@see ru.ifmo.se.pokemon.Pokemon#setStats
			*/
			this.setStats(
				35.0d,
				20.0d,
				65.0d,
				40.0d,
				65.0d,
				20.0d
			);
		}
		
		public Togepi(){
			this("Togepi", 1);
		}
}