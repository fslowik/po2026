package agh.po.symulator;

public class SkrzyniaBiegow extends Komponent{
    private int aktualnyBieg;
    private int iloscBiegow;
    public void zwiekszBieg(){
        if(this.aktualnyBieg < this.iloscBiegow)this.aktualnyBieg++;
    }
    public void zmniejszBieg(){
        if(this.aktualnyBieg >0)this.aktualnyBieg--;
    }
}
