package agh.po.animals;

public class Snake extends Animal{
    public Snake(String name){
        super(name,0);
    }
    @Override
    String getDescription() {
        return "kobra";
    }
    @Override
    public void makeSound() {
        System.out.println(name + "SSSSSSSSSSSSSS");
    }
}
