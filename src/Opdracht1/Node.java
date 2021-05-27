package Opdracht1;

import java.util.*;

public class Node {
    private String naam;
    private double afstand = Integer.MAX_VALUE;
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

    public double getAfstand() {
        return afstand;
    }

    public void setAfstand(double afstand) {
        this.afstand = afstand;
    }

    public HashMap<Node, Double> getVerbondenLocaties() {
        return verbondenLocaties;
    }

    public void setVerbondenLocaties(HashMap<Node, Double> verbondenLocaties) {
        this.verbondenLocaties = verbondenLocaties;
    }

    public String toString() {
        return naam;
    }
}
