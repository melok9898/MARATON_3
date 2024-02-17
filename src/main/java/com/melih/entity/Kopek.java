package com.melih.entity;

public class Kopek extends Hayvan implements Fonksiyonlar{


    public Kopek(String ad, String habitat, boolean tuyluMu) {
        super(ad, habitat, tuyluMu);
    }

    public void yemekYe() {
        System.out.println("Köpek yemek yedi.");
    }

    @Override
    public void uyu() {
        System.out.println("Köpek uyudu.");
    }

    @Override
    public void hareketEt() {
        System.out.println("Köpek yürüdü.");
    }

    @Override
    public void uyan() {
        System.out.println("Köpek uyandı.");
    }
}

