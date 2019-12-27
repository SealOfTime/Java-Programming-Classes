package ru.sealoftime.lab3.actors;

import ru.sealoftime.lab3.Interactable;
import ru.sealoftime.lab3.Item;

public class Door extends Actor implements Interactable {
    private boolean closed = true;
    private Item lock;
    public Door(Item lock){
        this.lock = lock;
    }

    public boolean isOpen(){
        return !closed;
    }
    @Override
    public boolean interact() {
        return false;
    }

    @Override
    public boolean interact(Item item) {
        return item.getSize() == this.lock.getSize();
    }
}
