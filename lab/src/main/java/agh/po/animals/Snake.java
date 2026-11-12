package agh.po.animals;

public class Snake extends Animal{
    public Snake(String name){
        super(name,4);
    }
    @Override
    String getDescription() {
        return "wąż";
    }
}
