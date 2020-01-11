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
	@Override
	public String toString(){
		return "Стол, на котором лежит " + (content!=null ? content.toString():"ничево на нем не лежит");
	}
	@Override
	public boolean equals(Object obj){
		if(!super.equals(obj)) return false;
		Table o = (Table) obj;
		if(this.size != o.size || !this.content.equals(o.content) || this.material != o.material) return false;
		return true;
	}
	@Override
	public int hashCode(){
		int hash = super.hashCode();
		hash = hash*31 + size.hashCode();
		hash = hash*31 + content.hashCode();
		hash = hash*31 + material.hashCode();
		return hash;
	}
    public Item takeItem() {
        Item result = this.content;
        this.content = null;
        return result;
    }
    public void putItem(Item item) {
    	this.content = item;
    }
    public Size getSize() {
        return size;
    }

    public Material getMaterial() {
        return material;
    }
}