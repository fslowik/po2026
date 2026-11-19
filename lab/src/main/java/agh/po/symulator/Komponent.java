package agh.po.symulator;

public class Komponent {
    protected String nazwa;
    protected double waga;
    protected double cena;
    protected String producent;
    protected String model;
    public String getNazwa(){
        return this.nazwa;
    }
    public double getWaga(){
        return this.waga;
    }
    public double getCena(){
        return this.cena;
    }
    public String getProducent(){
        return this.producent;
    }
    public String getModel(){
        return this.model;
    }

}
