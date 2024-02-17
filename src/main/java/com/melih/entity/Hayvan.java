package com.melih.entity;

public class Hayvan implements Fonksiyonlar {
    private String ad;
    private String habitat;
    private boolean tuyluMu;
    private static int hayvanSayisi = 0;

    public Hayvan(String ad, String habitat, boolean tuyluMu) {
        this.ad = ad;
        this.habitat = habitat;
        this.tuyluMu = tuyluMu;
        hayvanSayisi++;
        System.out.println("Hayvan sayısı: " + hayvanSayisi);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hayvan{");
        sb.append("ad='").append(ad).append('\'');
        sb.append(", habitat='").append(habitat).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public boolean isTuyluMu() {
        return tuyluMu;
    }

    public void setTuyluMu(boolean tuyluMu) {
        this.tuyluMu = tuyluMu;
    }

    public static int getHayvanSayisi() {
        return hayvanSayisi;
    }

    public static void setHayvanSayisi(int hayvanSayisi) {
        Hayvan.hayvanSayisi = hayvanSayisi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public void yemekYe() {
        System.out.println("Hayvan yemek yedi.");
    }

    @Override
    public void uyu() {
        System.out.println("Hayvan uyudu.");
    }

    @Override
    public void hareketEt() {
        System.out.println("Hayvan yürüdü.");
    }

    @Override
    public void uyan() {
        System.out.println("Hayvan uyandı.");
    }
}
