package sealoftime.lab2;

import ru.ifmo.se.pokemon.*;
import sealoftime.lab2.pokemons.*;
import sealoftime.lab2.attacks.*;
public class Lab2Test{
	public static void main(String[] args){
		Battle b = new Battle();
		b.addAlly(new Drampa());
		b.addAlly(new Togekiss());
		b.addAlly(new Darumaka());
		b.addFoe(new Darmanitan());
		b.addFoe(new Togepi());
		b.addFoe(new Togetic());
		b.go();
	}
}