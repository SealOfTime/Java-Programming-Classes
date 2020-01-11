package ru.sealoftime.lab3;

import ru.sealoftime.lab3.actors.*;
import ru.sealoftime.lab3.lightning.*;
import java.util.List;

public class Story {
    public static void main(String[] args) {
        Dungeon dungeon = new Dungeon(
        		new RowOfLamps(),
        		"низкое",
        		10, 5
        );
		System.out.println(dungeon);
		
        Alice alice = new Alice();
        dungeon.addActor(alice, 2, 2);
        
        Door door = new Door(new Item(Size.BIG, "замок", Material.METAL));
        
        for(int i = 0; i < dungeon.getWidth(); i++)
        	dungeon.addActor(door.clone(), i,0);
        for(int i = 0; i < dungeon.getLength(); i++)
        	dungeon.addActor(door.clone(), 0,i);
        for(int i = 0; i < dungeon.getWidth(); i++)
        	dungeon.addActor(door.clone(), i,dungeon.getLength()-1);
        for(int i = 0; i < dungeon.getLength(); i++)
        	dungeon.addActor(door.clone(), dungeon.getWidth()-1,i);
        
        Table table = new Table(Size.SMALL, Material.GLASS, 
        		new Item(Size.PETITE, "ключик", Material.GOLD));
        dungeon.addActor(table, 6, 2);
        
        Curtain curtain = new Curtain("до самого пола");
        dungeon.addActor(curtain, 8, 2);
        
        for(int i = 1; i < dungeon.getWidth()-1; i++) {
        	alice.step(i, 1);
        	List<Interactable> whatIsAroundAlice = alice.lookAround();
        	for(Interactable object : whatIsAroundAlice) {
				if(object instanceof Door){
					alice.interact(object);
					System.out.println(object);
				}
        	}
        }
        for(int i = 1; i < dungeon.getWidth()-1; i++) {
        	alice.step(i, dungeon.getLength()-2);
        	List<Interactable> whatIsAroundAlice = alice.lookAround();
        	for(Interactable object : whatIsAroundAlice) {
				if(object instanceof Door){
					alice.interact(object);
					System.out.println(object);
				}
        	}
        }
        for(int i = 1; i < dungeon.getLength()-1; i++) {
        	alice.step(1, i);
        	List<Interactable> whatIsAroundAlice = alice.lookAround();
        	for(Interactable object : whatIsAroundAlice) {
				if(object instanceof Door){
					alice.interact(object);
					System.out.println(object);
				}
        	}
        }
        for(int i = 1; i < dungeon.getLength()-1; i++) {
        	alice.step(dungeon.getWidth()-2, i);
        	List<Interactable> whatIsAroundAlice = alice.lookAround();
        	for(Interactable object : whatIsAroundAlice) {
				if(object instanceof Door){
					alice.interact(object);
					System.out.println(object);
				}
        	}
        }
        alice.step(2,2);
        for(int i = 1; i <= 3; i++) {
        	alice.step(2+i, 2, Mood.SAD);
			System.out.println(alice);
        }
        
        for(Interactable object : alice.lookAround()) {
        	if(object instanceof Table) {
        		if(alice.interact(object)) {
					System.out.println(object);
        			alice.giveItem(((Table)object).takeItem());
					System.out.println(alice);
        		}
        	}
        }
        for(int i = 1; i < dungeon.getWidth()-1; i++) {
        	alice.step(i, 1);
        	List<Interactable> whatIsAroundAlice = alice.lookAround();
        	for(Interactable object : whatIsAroundAlice) {
				if(object instanceof Door){
					alice.interact(object);
					System.out.println(object);
				}
        	}
        }
        for(int i = 1; i < dungeon.getWidth()-1; i++) {
        	alice.step(i, dungeon.getLength()-2);
        	List<Interactable> whatIsAroundAlice = alice.lookAround();
        	for(Interactable object : whatIsAroundAlice) {
				if(object instanceof Door){
					alice.interact(object);
					System.out.println(object);
				}
        	}
        }
        for(int i = 1; i < dungeon.getLength()-1; i++) {
        	alice.step(1, i);
        	List<Interactable> whatIsAroundAlice = alice.lookAround();
        	for(Interactable object : whatIsAroundAlice) {
				if(object instanceof Door){
					alice.interact(object);
					System.out.println(object);
				}
        	}
        }
        for(int i = 1; i < dungeon.getLength()-1; i++) {
        	alice.step(dungeon.getWidth()-2, i);
        	List<Interactable> whatIsAroundAlice = alice.lookAround();
        	for(Interactable object : whatIsAroundAlice) {
				if(object instanceof Door){
					alice.interact(object);
					System.out.println(object);
				}
        	}
        }
        alice.step(7,2);
        for(Interactable object : alice.lookAround()) {
			System.out.println(alice.lookAround());
        	if(object instanceof Curtain) {
				System.out.println(object);
        		alice.interact(object);
        	}
        }
    }
}