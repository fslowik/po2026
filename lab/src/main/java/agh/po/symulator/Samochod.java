package agh.po.symulator;

public class Samochod {
    private Silnik silnik;
    private SkrzyniaBiegow skrzynia;
    private boolean stan;
    private String nrRejest;
    private String model;
    private int predkoscMax;

    public void wlacz(){
        this.silnik.uruchom();
    }
    public void wylacz(){
        this.silnik.zatrzymaj();
    }
    public void jedzDo(String cel){

    }
    public double getWaga(){
        return silnik.getWaga()+skrzynia.getWaga();
    }


}
