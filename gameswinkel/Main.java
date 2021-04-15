package gameswinkel;
import java.util.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        int releaseJaar1 = LocalDate.now().getYear() - 1;
        int releaseJaar2 = LocalDate.now().getYear() - 2;

        Games g1 = new Games("Just Cause 3", releaseJaar1, 49.98);
        Games g2 = new Games("Need for speed: Rivals", releaseJaar2, 45.99);
        Games g3 = new Games("Need for speed: Rivals", releaseJaar2, 45.99);

        Persoon p1 = new Persoon("Eric", 200);
        Persoon p2 = new Persoon("Hans", 55);
        Persoon p3 = new Persoon("Arno", 185);

        System.out.println("\n" + p1.Koop(g1));
        System.out.println("\n" + p1.Koop(g2));
        System.out.println("\n" + p1.Koop(g3));
        // Hij kan een game kopen met dezelfde naam, ik weet niet hoe ik dit verbeter
        System.out.println("\n" + p2.Koop(g2));
        System.out.println("\n" + p2.Koop(g1));
        System.out.println("\n" + p3.Koop(g3));

        System.out.println("\n" + p1);
        System.out.println("\n" + p2);
        System.out.println("\n" + p3);

        System.out.println("\n" + p1.Verkoop(g1, p3));
        System.out.println("\n" + p2.Verkoop(g2, p3));
        System.out.println("\n" + p2.Verkoop(g1, p1));

        System.out.println("\n" + p1);
        System.out.println("\n" + p2);
        System.out.println("\n" + p3);
    }
}
