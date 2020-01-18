package ru.sealoftime.lab4.actors;

public class Rabbit extends Actor{
	private long timeLeft;
	
	public Rabbit(){
		timeLeft = 0;
	}
	
	public void disappear(){
		this.getDungeon().removeActor(this);
		System.out.println("Кролик исчез за поворотом");
	}
	
	 @Override
    public String toString() {
    	return "Ой, кролик опаздывает";
    }
}