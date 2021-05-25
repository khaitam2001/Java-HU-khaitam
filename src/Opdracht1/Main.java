package Opdracht1;

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

        Reis reis = new Reis(a, f);
        reis.addNode(a);
        reis.addNode(b);
        reis.addNode(c);
        reis.addNode(d);
        reis.addNode(e);
        reis.addNode(f);
        reis.addNode(g);

        System.out.println(reis);
        reis.compareTo();

    }
}
