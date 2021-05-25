package Opdracht1;

public class Main {
    public static void main(String[] args) {
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");

        a.addVerbondenLocaties(b, 10);
        a.addVerbondenLocaties(c, 15);
        b.addVerbondenLocaties(d, 12);
        b.addVerbondenLocaties(f, 15);
        c.addVerbondenLocaties(e, 10);
        d.addVerbondenLocaties(e, 2);
        d.addVerbondenLocaties(f, 1);
        f.addVerbondenLocaties(e, 5);

        Reis reis = new Reis(a, f);
        reis.compareTo();

    }
}
