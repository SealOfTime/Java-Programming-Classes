package ru.sealoftime.lab4;

import ru.sealoftime.lab4.actors.*;
import ru.sealoftime.lab4.lightning.*;
import java.util.List;
import java.util.function.Consumer;
public class Story {
    public static void main(String[] args) {
        Dungeon dungeon = new Dungeon(
        		new RowOfLamps(),
        		"низкое",
        		10, 5
        );
		
		
        Alice alice = new Alice();
		try{
			dungeon.addActor(alice, 2, 2);
        }catch(Dungeon.SpotOccupiedException e){
			e.printStackTrace();
		}
				
		Rabbit r = new Rabbit();
		try{
			dungeon.addActor(r, 3, 2);
		}catch(Dungeon.SpotOccupiedException e){
			e.printStackTrace();
		}
		System.out.println(r);
		r.disappear();
		System.out.println(dungeon);
		
        Door door = new Door(new Item(Size.BIG, "замок", Material.METAL));
        try{
			for(int i = 0; i < dungeon.getWidth(); i++)
				dungeon.addActor(door.clone(), i,0);
			for(int i = 1; i < dungeon.getLength(); i++)
				dungeon.addActor(door.clone(), 0,i);
			for(int i = 1; i < dungeon.getWidth(); i++)
				dungeon.addActor(door.clone(), i,dungeon.getLength()-1);
			for(int i = 1; i < dungeon.getLength()-1; i++)
				dungeon.addActor(door.clone(), dungeon.getWidth()-1,i);
        }catch(Dungeon.SpotOccupiedException e){
			e.printStackTrace();
		}
        Table table = new Table(Size.SMALL, Material.GLASS, 
        		new Item(Size.PETITE, "ключик", Material.GOLD));
		try{
			dungeon.addActor(table, 6, 2);
        }catch(Dungeon.SpotOccupiedException e){
			e.printStackTrace();
		}
        Curtain curtain = new Curtain("до самого пола", new Door.SizedDoor(Size.SMALL, new Item(Size.PETITE, "замок", Material.METAL)));
		try{
			dungeon.addActor(curtain, 7, 2);
		}catch(Dungeon.SpotOccupiedException e){
			e.printStackTrace();
		}
        
		abstract class Walk{
			private int stepUntil;
			
			Walk(int stepUntil){
				this.stepUntil = stepUntil;
			}
			
			abstract void step(int i);
			
			public void run(){
				for(int i = 1; i < stepUntil; i++) {
					step(i);
					List<Interactable> whatIsAroundAlice = alice.lookAround();
					for(Interactable object : whatIsAroundAlice) {
						if(object instanceof Door){
							alice.interact(object);
							System.out.println(object);
						}
					}
				}
			}
		}
		Walk walkTopWall = new Walk(dungeon.getWidth()-1){
			void step(int i){
				alice.step(i, 1);
			}
		};
		Walk walkBottomWall = new Walk(dungeon.getWidth()-1){
			void step(int i){
				alice.step(i, dungeon.getLength()-2);
			}
		};
		Walk walkLeftWall = new Walk(dungeon.getLength()-1){
			void step(int i){
				alice.step(1, i);
			}
		};
		Walk walkRightWall = new Walk(dungeon.getLength()-1){
			void step(int i){
				alice.step(dungeon.getWidth()-2, i);
			}
		};
		walkTopWall.run();
		walkBottomWall.run();
        walkLeftWall.run();
		walkRightWall.run();	
		
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
		
        walkTopWall.run();
		walkBottomWall.run();
        walkLeftWall.run();
		walkRightWall.run();
		
        alice.step(8,2);
        for(Interactable object : alice.lookAround()) {
        	if(object instanceof Curtain) {
				System.out.println(object);
        		alice.interact(object);
        	}
        }
		for(Interactable object : alice.lookAround()) {
        	if(object instanceof Door.SizedDoor) {
        		alice.interact(object);
				System.out.println(alice);
        	}
        }
    }
}