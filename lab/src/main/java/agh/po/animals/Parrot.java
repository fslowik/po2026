package agh.po.animals;

public class Parrot extends Animal{
    public Parrot(String name){
        super(name,2);
    }

    @Override
    String getDescription() {
        return "ara "+name;
    }
    @Override
    public void makeSound() {
        System.out.println(name + "kra!");
    }
}
