package Opdracht1;

public class Main {
    public static void main(String[] args) {
        Koper k1 = new Koper("Cendur Oyib");
        Verkoper v1 = new Verkoper("Khai-Tam Nguyen");
        Game g1 = new Game("Need for speed 1", 60);
        Game g2 = new Game("Dance with me", 45);
        Game g3 = new Game("Dance with me", 30);

        System.out.println(g2.equals(g3));

        k1.setBudget(100);
        v1.setBudget(100);

        System.out.println(k1);
        System.out.println(v1 + "\n");
        v1.addGames(g1);
        System.out.println(v1 + "\n");

        Transactie t1 = new Transactie(k1, v1, g1);
        System.out.println(t1 + "\n");
        t1.voerTransactieUit();
        Transactie t2 = new Transactie(k1, v1, g3);
        t2.voerTransactieUit();
    }
}
