package sealoftime.lab2;

import java.util.Locale;
import ru.ifmo.se.pokemon.*;
import sealoftime.lab2.pokemons.*;
import sealoftime.lab2.attacks.*;
public class Lab2Test{
	public static void main(String[] args){
		//Suggestion: Pokemons should be able to have multiple status effects at once
		if(args.length > 0 && args[0].equals("ru")){
			Locale.setDefault(new Locale("ru", "RU"));
		} else{
			Locale.setDefault(Locale.ENGLISH);
		}
		Battle b = new Battle();
		b.addAlly(new Drampa("Матвей", 1));
		b.addAlly(new Togekiss("Женя", 1));
		b.addAlly(new Darumaka("Здравый Смысл", 1));
		b.addFoe(new Darmanitan("Александр Сергеевич", 100));
		b.addFoe(new Togepi("ITMO", 100));
		b.addFoe(new Togetic("ПСЖ", 100));
		b.go();
	}
}