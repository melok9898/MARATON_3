package com.melih;

import com.melih.entity.Hayvan;
import com.melih.entity.Kopek;
import com.melih.entity.Kus;

public class Runner {
    public static void main(String[] args) {
        Hayvan hayvan1 = new Hayvan("Zübeyir Eşşeği","Otlak Arazi",true); // normal cagirma polymorphisim yok.
        System.out.println(hayvan1.isTuyluMu());
        hayvan1.hareketEt();
        System.out.println(hayvan1.getHabitat());



        Hayvan gugukkusu = new Kus("Ağaçkakan_Woody","Ağaç",true);
        gugukkusu.yemekYe();
        gugukkusu.hareketEt();
        gugukkusu.uyu();
        gugukkusu.uyan();



        gugukkusu.setAd("AĞAÇKAKMAYAN_WOODY");
        System.out.println(gugukkusu.getAd());

        Hayvan GaripKont = new Kopek("GaripKONT","sokak_kopegi",true);
        GaripKont.yemekYe();
        GaripKont.uyu();
        GaripKont.uyan();

        Kus gocedenkus_finalkullanimi = new Kus("ATMACA","Doğa",true);
        gocedenkus_finalkullanimi.gocEt(); //final fonksiyon kuş classı içinde
        System.out.println(gocedenkus_finalkullanimi.getAd());gocedenkus_finalkullanimi.getAd();
        gocedenkus_finalkullanimi.yemekYe("kurbağa"); // OVERLOADİNG







    }


}
