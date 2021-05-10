package com.company;

public class Main {
    public static void main(String[] args) {
        Huis h1 = new Huis("Nijeoord 1",1970);
        Persoon p1 = new Persoon("Ronald Plasterk", 52);

        h1.setHuisbaas(p1);
        System.out.println(h1);

        Huis h2 = new Huis("Vredenburg", 1991);
        Persoon p2 = new Persoon("Annie Brouwers", 59);

        h2.setHuisbaas(p2);
        System.out.println(h2);

        System.out.println("Huisbaas 1: " + h1.getHuisbaas().toString());
        System.out.println("Huisbaas 2: " + h2.getHuisbaas().toString());
    }
}





