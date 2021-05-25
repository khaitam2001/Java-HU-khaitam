package Opdracht1;

import java.util.PriorityQueue;

public class Reis implements Comparable{
    private Node beginPlaats;
    private Node eindPlaats;

    public Reis(Node beginPlaats, Node eindPlaats) {
        this.beginPlaats = beginPlaats;
        this.eindPlaats = eindPlaats;
    }

    public Node getBeginPlaats() {
        return beginPlaats;
    }

    public void setBeginPlaats(Node beginPlaats) {
        this.beginPlaats = beginPlaats;
    }

    public Node getEindPlaats() {
        return eindPlaats;
    }

    public void setEindPlaats(Node eindPlaats) {
        this.eindPlaats = eindPlaats;
    }

    @Override
    public void compareTo() {
        Node currentNode = beginPlaats;
        Stap [] stappen = new Stap [6];

        for (int i = 0; i < beginPlaats.getVerbondenLocaties().size(); i++) {
            stappen[i] = new Stap();
            System.out.println(beginPlaats.getVerbondenLocaties());
        }

        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        System.out.println(pQueue.peek());
    }
}
