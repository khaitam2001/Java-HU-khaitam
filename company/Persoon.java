package com.company;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String Naam, int Leeftijd) {
        this.naam = Naam;
        this.leeftijd = Leeftijd;
    }

    public String toString(){
        return this.getNaam() + "; leeftijd " + this.getLeeftijd() + " jaar";
    }

    public String getNaam(){
        return this.naam;
    }

    public void setNaam(String newNaam){
        this.naam = newNaam;
    }

    public int getLeeftijd(){
        return this.leeftijd;
    }

    public void setLeeftijd(int newLeeftijd){
        this.leeftijd = newLeeftijd;
    }
}