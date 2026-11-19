package agh.po.symulator;

public class Silnik extends Komponent {
    private int maxObroty;
    private int obroty;
    public void uruchom(){
        this.obroty = 1000;
    }
    public void zatrzymaj(){
        this.obroty = 0;
    }

}
