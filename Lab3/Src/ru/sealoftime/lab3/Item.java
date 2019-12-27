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
}
