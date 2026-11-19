package agh.po.symulator;

public class Silnik extends Komponent {
    private String nazwa;
    private double waga;
    private double cena;
    private int maxObroty;
    private int obroty;
    public void uruchom(){
        this.obroty = 1000;
    }
    public void zatrzymaj(){
        this.obroty = 0;
    }

    public void zwiekszObroty(int delta){
        if(this.obroty + delta <=this.maxObroty){
            this.obroty = this.obroty+delta;}
        else {this.obroty = this.maxObroty;}
    }
    public void zmniejszObroty(int delta){
        if(this.obroty - delta >=1000){
            this.obroty = this.obroty - delta;
        }else zatrzymaj();
    }


}
