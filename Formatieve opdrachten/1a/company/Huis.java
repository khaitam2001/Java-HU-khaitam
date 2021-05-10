package com.company;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis(String Adres, int Bouwjaar) {
        this.adres = Adres;
        this.bouwjaar = Bouwjaar;
    }

    public String toString() {
        return "Huis " + this.getAdres() + " is gebouwd in " + getAdres() + " en heeft huisbaas " + getHuisbaas();
    }

    public String getAdres(){
        return this.adres;
    }

    public void setHuisbaas(Persoon nieuwPersoon){
        this.huisbaas = nieuwPersoon;
    }

    public Persoon getHuisbaas(){
        return this.huisbaas;
    }
}