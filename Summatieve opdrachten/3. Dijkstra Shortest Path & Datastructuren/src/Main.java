package Opdracht1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");
        Node g = new Node("g");

        a.addNeighbour(new Rit(a, b, 3));
        a.addNeighbour(new Rit(a, c, 6));
        b.addNeighbour(new Rit(b, a, 3));
        b.addNeighbour(new Rit(b, c, 2));
        b.addNeighbour(new Rit(b, e, 9));
        b.addNeighbour(new Rit(b, d, 7));
        c.addNeighbour(new Rit(c, a, 6));
        c.addNeighbour(new Rit(c, b, 2));
        c.addNeighbour(new Rit(c, e, 2));
        c.addNeighbour(new Rit(c, f, 6));
        d.addNeighbour(new Rit(d, b, 7));
        d.addNeighbour(new Rit(d, d, 3));
        d.addNeighbour(new Rit(d, f, 5));
        d.addNeighbour(new Rit(d, g, 8));
        e.addNeighbour(new Rit(e, b, 9));
        e.addNeighbour(new Rit(e, c, 2));
        e.addNeighbour(new Rit(e, f, 4));
        e.addNeighbour(new Rit(e, d, 3));
        f.addNeighbour(new Rit(f, c, 6));
        f.addNeighbour(new Rit(f, e, 4));
        f.addNeighbour(new Rit(f, d, 5));
        f.addNeighbour(new Rit(f, g, 4));
        g.addNeighbour(new Rit(g, f, 4));
        g.addNeighbour(new Rit(g, d, 8));

        Reis reis1 = new Reis("Reis1",a, g);
        Reis reis2 = new Reis("Reis2",a, g);
        List<Node> mogelijkePad = new ArrayList<>(Arrays.asList(a, b, c, e, d, f, g));
        reis2.setPad(mogelijkePad);

        reis1.addNode(a);
        reis1.addNode(b);
        reis1.addNode(c);
        reis1.addNode(d);
        reis1.addNode(e);
        reis1.addNode(f);
        reis1.addNode(g);

        // Kijk hier de paden van de verschillende reizen
        reis1.calculateBestPath();
        System.out.println("Reis1 pad: " + reis1.getPad());
        System.out.println("Reis2 pad: " + reis2.getPad());

        // Kijk de afstand van de verschillende paden
        System.out.println("Reis1 afstand: " + reis1.calculateDistance());
        System.out.println("Reis2 afstand: " + reis2.calculateDistance());

        reis1.compareTo(reis2);

        // We kijken wat er gebeurt als er een pad wordt gebruikt, dat niet kan bestaan.
        List<Node> onmogelijkePad = new ArrayList<>(Arrays.asList(a, b, c, d, e, f, g));
        reis2.setPad(onmogelijkePad);
        System.out.println(reis1.compareTo(reis2));

        // We kijken wat er gebeurt als een van de datatypes anders is, dan handelt de functie dit netjes.
        g.addNeighbour(new Treinrit(g, d, 8));
        reis2.setPad(mogelijkePad);
        System.out.println(reis1.compareTo(reis2));
    }
}
