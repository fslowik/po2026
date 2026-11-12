package agh.po.animals;

public class Elephant extends Animal{
    public Elephant(String name){
        super(name,4);
    }
    @Override
    String getDescription() {
        return "słoń";
    }
}
