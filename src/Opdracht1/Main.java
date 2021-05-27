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

        a.addLocatie(b, 3);
        a.addLocatie(c, 6);
        b.addLocatie(a, 3);
        b.addLocatie(c, 2);
        b.addLocatie(e, 9);
        b.addLocatie(d, 7);
        c.addLocatie(a, 6);
        c.addLocatie(b, 2);
        c.addLocatie(e, 2);
        c.addLocatie(f, 6);
        d.addLocatie(b, 7);
        d.addLocatie(e, 3);
        d.addLocatie(f, 5);
        d.addLocatie(g, 8);
        e.addLocatie(b, 9);
        e.addLocatie(c, 2);
        e.addLocatie(f, 4);
        e.addLocatie(d, 3);
        f.addLocatie(c,6);
        f.addLocatie(e,4);
        f.addLocatie(d,5);
        f.addLocatie(g, 4);
        g.addLocatie(f, 4);
        g.addLocatie(d, 8);

        Rit rit1 = new Rit(a, g);
        rit1.addNode(a);
        rit1.addNode(b);
        rit1.addNode(c);
        rit1.addNode(d);
        rit1.addNode(e);
        rit1.addNode(f);
        rit1.addNode(g);

        rit1.calculateBestPath();
        System.out.println(rit1);

        List<Node> listnodes = Arrays.asList(a, b, c, d, e, f, g);
        System.out.println((rit1.compareTo(listnodes)));

    }
}
