package Opdracht1;

public class Main {
    public static void main(String[] args) {
        Koper k1 = new Koper("Koper1");
        Verkoper v1 = new Verkoper("Verkoper1");
        Game g1 = new Game("Need for speed 1", 60);
        Game g2 = new Game("Dance with me", 45);
        Game g3 = new Game("Dance with me", 30);

        k1.setBudget(100);
        v1.setBudget(100);

        System.out.println(k1);
        System.out.println(v1);
        // Voeg de game g1 toe aan de verkoper v1
        v1.addGames(g1);
        System.out.println(v1);
        System.out.println("");

        // Transactie waar Koper1 de Game Need for speed 1 wilt kopen van Verkoper1
        Transactie t1 = new Transactie(k1, v1, g1);
        System.out.println(t1);
        // Voer de transactie hierna uit. Dit moet aan een aantal dingen voldoen.
        // 1. Koper heeft game niet.
        // 2. Verkoper heeft de game.
        // 3. Koper heeft genoeg geld
        t1.voerTransactieUit();
        System.out.println("");

        // Hier zien we wat er gebeurt als de koper de game al heeft.
        k1.addToBudget(100);
        Transactie t2 = new Transactie(k1, v1, g1);
        t2.voerTransactieUit();
    }
}
