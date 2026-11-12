package agh.po.animals;

public class Dog extends Animal{
    public Dog(String name){
        super(name,4);
    }

    @Override
    String getDescription() {
        return "pies";
    }
}
