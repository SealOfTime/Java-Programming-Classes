package sealoftime.lab2;

import java.util.Locale;
import ru.ifmo.se.pokemon.*;
import sealoftime.lab2.pokemons.*;
import sealoftime.lab2.attacks.*;
public class Lab2Test{
	public static void main(String[] args){
		if(args.length > 0 && args[0].equals("ru")){
			Locale.setDefault(new Locale("ru", "RU"));
		} else{
			Locale.setDefault(Locale.ENGLISH);
		}
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