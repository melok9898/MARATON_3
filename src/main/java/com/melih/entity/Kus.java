package com.melih.entity;

public class Kus extends Hayvan implements Fonksiyonlar{


    public Kus(String ad, String habitat, boolean tuyluMu) {
        super(ad, habitat, tuyluMu);
    }

    public void yemekYe() {
        System.out.println("Kuş yemek yedi.");
    }
    public void yemekYe(String neyesin){ //OVERLOAD ÖRNEK
        System.out.println(  "Bu kuş yemek olarak " + neyesin + " yedi....");
    }

    @Override
    public void uyu() {
        System.out.println("Kuş uyudu.");
    }

    @Override
    public void hareketEt() {
        System.out.println("Kuş uçtu.");
    }

    @Override
    public void uyan() {
        System.out.println("Kuş uyandı.");
    }
    public final void gocEt(){
        System.out.println("!!!! KUŞ GÖÇ ETTİ !!!!");
    }//final kullanımı
}
