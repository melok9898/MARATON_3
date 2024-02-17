package com.melih.entity;

public class Kedi extends Hayvan implements Fonksiyonlar {


    public Kedi(String ad, String habitat, boolean tuyluMu) {
        super(ad, habitat, tuyluMu);
    }

    public void yemekYe() {
        System.out.println("Kedi yemek yedi.");
    }

    @Override
    public void uyu() {
        System.out.println("Kedi uyudu.");
    }

    @Override
    public void hareketEt() {
        System.out.println("Kedi yürüdü.");
    }

    @Override
    public void uyan() {
        System.out.println("Kedi uyandı.");
    }
}


