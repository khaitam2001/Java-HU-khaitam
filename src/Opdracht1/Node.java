package Opdracht1;

import java.util.*;

public class Node {
    private String naam;
    private LinkedList<Node> korstePad = new LinkedList<>();
    private int afstand = Integer.MAX_VALUE;
    private HashMap<Node, Double> verbondenLocaties = new HashMap<Node, Double>();

    public Node(String naam) {
        this.naam = naam;
    }

    public void addLocatie(Node locatie, double afstand) {
        verbondenLocaties.put(locatie, afstand);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public LinkedList<Node> getKorstePad() {
        return korstePad;
    }

    public void setKorstePad(LinkedList<Node> korstePad) {
        this.korstePad = korstePad;
    }

    public int getAfstand() {
        return afstand;
    }

    public void setAfstand(int afstand) {
        this.afstand = afstand;
    }

    public HashMap<Node, Double> getVerbondenLocaties() {
        return verbondenLocaties;
    }

    public void setVerbondenLocaties(HashMap<Node, Double> verbondenLocaties) {
        this.verbondenLocaties = verbondenLocaties;
    }
}
