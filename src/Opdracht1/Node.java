package Opdracht1;

import java.sql.Array;
import java.util.*;

public class Node {
    private String naam;
    private double afstand = Integer.MAX_VALUE;
    private List<Stap> neighbours = new ArrayList<Stap>();

    public Node(String naam) {
        this.naam = naam;
    }

    public void addNeighbour(Stap stap) {
        neighbours.add(stap);
    }

    public List<Stap> getNeighbours() {
        return neighbours;
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

    public String toString() {
        return naam;
    }
}
