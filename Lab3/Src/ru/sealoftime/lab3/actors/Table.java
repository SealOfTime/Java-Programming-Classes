package ru.sealoftime.lab3.actors;

import ru.sealoftime.lab3.Interactable;
import ru.sealoftime.lab3.Item;
import ru.sealoftime.lab3.Material;
import ru.sealoftime.lab3.Size;

public class Table extends Actor implements Interactable {
    private Size size;
    private Item content;
    private Material material;

    public Table(Size size, Material material, Item content){
        this.size = size;
        this.material = material;
        this.content = content;
    }

    @Override
    public boolean interact() {
        return true;
    }

    @Override
    public boolean interact(Item item) {
        return content == null;
    }

    public Item takeItem() {
        Item result = this.content;
        this.content = null;
        return result;
    }

    public Size getSize() {
        return size;
    }

    public Material getMaterial() {
        return material;
    }
}
