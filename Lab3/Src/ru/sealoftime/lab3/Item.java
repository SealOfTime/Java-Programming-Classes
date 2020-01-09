package ru.sealoftime.lab3;

public class Item {
    private Size size;
    private String name;
    private Material material;
    public Item(Size size, String name, Material material){
        this.size = size;
        this.name = name;
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }
    @Override
	public String toString(){
		return size + " " + material + " " + name;
	}
	@Override
	public int hashCode(){
		int hash = 1;
		hash = hash*31 + size.hashCode();
		hash = hash*31 + name.hashCode();
		hash = hash*31 + material.hashCode();
		return hash;
	}
	@Override
	public boolean equals(Object obj){
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		Item o = (Item) obj;
		if(size != o.size || material != o.material || !name.equals(o.name)) return false;
		return true;
	}
    @Override
    public Item clone() {
    	return new Item(this.size, this.name, this.material);
    }
}