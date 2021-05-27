package Opdracht1;

import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReisTest {

    //

    @Test
    public void testDijkstraAlgoritme() {
        // Test of het dijkstra algoritme werkt
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

        Reis r1 = new Reis("Reis1", a, g);
        r1.addNode(a);
        r1.addNode(b);
        r1.addNode(c);
        r1.addNode(d);
        r1.addNode(e);
        r1.addNode(f);
        r1.addNode(g);
        r1.calculateBestPath();

        List<Node> correcteAntwoord = new ArrayList<>(Arrays.asList(a, b, c, f, g));
        Assert.assertEquals(correcteAntwoord, r1.getPad());

    }
    @Test
    public void testPadKanBestaan() {
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

        Reis r1 = new Reis("r1", a, g);


        List<Node> mogelijkePad = new ArrayList<>(Arrays.asList(a, b, c, e, d, f, g));
        // Er is geen verbinding tussen D en E, daarom kan hij niet bestaan.
        List<Node> onmogelijkePad = new ArrayList<>(Arrays.asList(a, b, c, d, e, f, g));

        r1.setPad(mogelijkePad);
        boolean actual = r1.padKanBestaan();
        Assert.assertEquals(true, actual);

        r1.setPad(onmogelijkePad);
        actual = r1.padKanBestaan();
        Assert.assertEquals(false, actual);
    }
    @Test
    public void testCalculateDistance() {
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

        Reis r1 = new Reis("Reis1", a, g);
        List<Node> stappen = new ArrayList<>(Arrays.asList(a, b, c, e, d, f, g));
        r1.setPad(stappen);
        double actual = r1.calculateDistance();

        Assert.assertEquals(19.0, actual, 0.001);
    }

    @Test
    public void compareToVerschillendeDatatypen() {
        // Als er verschillende data types zijn, dan handelt de functies dit netjes.
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
        e.addNeighbour(new Treinrit(e, f, 4));
        e.addNeighbour(new Rit(e, d, 3));
        f.addNeighbour(new Rit(f, c, 6));
        f.addNeighbour(new Rit(f, e, 4));
        f.addNeighbour(new Rit(f, d, 5));
        f.addNeighbour(new Rit(f, g, 4));
        g.addNeighbour(new Rit(g, f, 4));
        g.addNeighbour(new Rit(g, d, 8));

        Reis r1 = new Reis("Reis1", a, g);
        r1.addNode(a);
        r1.addNode(b);
        r1.addNode(c);
        r1.addNode(d);
        r1.addNode(e);
        r1.addNode(f);
        r1.addNode(g);

        Reis r2 = new Reis("Reis2", a, g);
        List<Node> stappen = new ArrayList<>(Arrays.asList(a, b, c, e, d, f, g));

        r1.calculateBestPath();
        r1.setPad(stappen);
        Assert.assertEquals("Datatypes zijn niet allemaal hetzelfde", r1.compareTo(r2));
    }

    @Test
    public void compareToMetTreinrit() {
        // De compareTo methode werkt met treinrit.

        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");
        Node g = new Node("g");

        a.addNeighbour(new Treinrit(a, b, 3));
        a.addNeighbour(new Treinrit(a, c, 6));
        b.addNeighbour(new Treinrit(b, a, 3));
        b.addNeighbour(new Treinrit(b, c, 2));
        b.addNeighbour(new Treinrit(b, e, 9));
        b.addNeighbour(new Treinrit(b, d, 7));
        c.addNeighbour(new Treinrit(c, a, 6));
        c.addNeighbour(new Treinrit(c, b, 2));
        c.addNeighbour(new Treinrit(c, e, 2));
        c.addNeighbour(new Treinrit(c, f, 6));
        d.addNeighbour(new Treinrit(d, b, 7));
        d.addNeighbour(new Treinrit(d, d, 3));
        d.addNeighbour(new Treinrit(d, f, 5));
        d.addNeighbour(new Treinrit(d, g, 8));
        e.addNeighbour(new Treinrit(e, b, 9));
        e.addNeighbour(new Treinrit(e, c, 2));
        e.addNeighbour(new Treinrit(e, f, 4));
        e.addNeighbour(new Treinrit(e, d, 3));
        f.addNeighbour(new Treinrit(f, c, 6));
        f.addNeighbour(new Treinrit(f, e, 4));
        f.addNeighbour(new Treinrit(f, d, 5));
        f.addNeighbour(new Treinrit(f, g, 4));
        g.addNeighbour(new Treinrit(g, f, 4));
        g.addNeighbour(new Treinrit(g, d, 8));

        Reis r1 = new Reis("Reis1", a, g);
        r1.addNode(a);
        r1.addNode(b);
        r1.addNode(c);
        r1.addNode(d);
        r1.addNode(e);
        r1.addNode(f);
        r1.addNode(g);

        Reis r2 = new Reis("Reis2", a, g);
        List<Node> stappen = new ArrayList<>(Arrays.asList(a, b, c, e, d, f, g));

        r1.calculateBestPath();
        r1.setPad(stappen);
        Assert.assertEquals("Reis2 is 19.0minuten korter dan Reis1", r1.compareTo(r2));
    }

    @Test
    public void compareToMetVlucht() {
        // De compareTo methode werkt met vlucht
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");
        Node g = new Node("g");

        a.addNeighbour(new Vlucht(a, b, 3));
        a.addNeighbour(new Vlucht(a, c, 6));
        b.addNeighbour(new Vlucht(b, a, 3));
        b.addNeighbour(new Vlucht(b, c, 2));
        b.addNeighbour(new Vlucht(b, e, 9));
        b.addNeighbour(new Vlucht(b, d, 7));
        c.addNeighbour(new Vlucht(c, a, 6));
        c.addNeighbour(new Vlucht(c, b, 2));
        c.addNeighbour(new Vlucht(c, e, 2));
        c.addNeighbour(new Vlucht(c, f, 6));
        d.addNeighbour(new Vlucht(d, b, 7));
        d.addNeighbour(new Vlucht(d, d, 3));
        d.addNeighbour(new Vlucht(d, f, 5));
        d.addNeighbour(new Vlucht(d, g, 8));
        e.addNeighbour(new Vlucht(e, b, 9));
        e.addNeighbour(new Vlucht(e, c, 2));
        e.addNeighbour(new Vlucht(e, f, 4));
        e.addNeighbour(new Vlucht(e, d, 3));
        f.addNeighbour(new Vlucht(f, c, 6));
        f.addNeighbour(new Vlucht(f, e, 4));
        f.addNeighbour(new Vlucht(f, d, 5));
        f.addNeighbour(new Vlucht(f, g, 4));
        g.addNeighbour(new Vlucht(g, f, 4));
        g.addNeighbour(new Vlucht(g, d, 8));

        Reis r1 = new Reis("Reis1", a, g);
        r1.addNode(a);
        r1.addNode(b);
        r1.addNode(c);
        r1.addNode(d);
        r1.addNode(e);
        r1.addNode(f);
        r1.addNode(g);

        Reis r2 = new Reis("Reis2", a, g);
        List<Node> stappen = new ArrayList<>(Arrays.asList(a, b, c, e, d, f, g));

        r1.calculateBestPath();
        r1.setPad(stappen);
        Assert.assertEquals("Reis2 is 19.0euro korter dan Reis1", r1.compareTo(r2));
    }
}