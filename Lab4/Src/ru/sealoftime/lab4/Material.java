package ru.sealoftime.lab4;

public enum Material {
    DEFAULT("Материальный"), 
    WOOD("Деревянный"), 
    METAL("Металлический"), 
    GLASS("Стеклянный"),
    GOLD("Золотой");
	
	private final String name;
	Material(String name) {
        this.name = name;
    }
	@Override
    public String toString(){return name;}
}