package agh.po.animals;

public class Zebra extends Animal{
    public Zebra(String name){
        super(name,4);
    }

    @Override
    String getDescription() {
        return "zebra";
    }
}
