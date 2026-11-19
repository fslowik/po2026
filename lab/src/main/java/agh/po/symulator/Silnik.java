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

    public void zwiekszObroty(int delta){
        this.obroty = Math.max(this.obroty + delta, this.maxObroty);
    }
    public void zmniejszObroty(int delta){
        if(this.obroty - delta >=1000){
            this.obroty = this.obroty - delta;
        }else zatrzymaj();
    }


}
