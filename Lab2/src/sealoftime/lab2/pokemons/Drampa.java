package sealoftime.lab2.pokemons;

import ru.ifmo.se.pokemon.*;
import sealoftime.lab2.attacks.*;
public class Drampa extends Pokemon{
	
		public Drampa(String name, int level){
			super(name, level);
			this.addType(Type.NORMAL);
			this.addType(Type.DRAGON);
			this.addMove(new Confide());
			this.addMove(new SwordsDance());
			this.addMove(new Psychic());
			this.addMove(new Screech());
			/*
			Задаю базовые значения характеристик покемона в порядке
			(HP, ATT, DEF, ATT Speed, DEF Speed, SPEED)
			@see ru.ifmo.se.pokemon.Pokemon#setStats
			*/
			this.setStats(
				78.0d,
				60.0d,
				85.0d,
				135.0d,
				91.0d,
				36.0d
			);
		}
		
		public Drampa(){
			this("Drampa", 1);
		}
}