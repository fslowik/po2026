package agh.po.animals;

public abstract class Animal {
    abstract String getDescription();
    protected String name;
    protected int legs;
    public Animal(String name, int legs){
        this.name = name;
        this.legs = legs;
    }
    public int getLegs(){
        return legs;
    }
    public abstract void makeSound();
}
