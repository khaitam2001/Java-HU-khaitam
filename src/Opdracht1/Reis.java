package Opdracht1;
import java.util.*;
// SOURCES = https://www.baeldung.com/java-dijkstra en https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-greedy-algo-7/

public class Reis implements Comparable {
    private Node beginNode;
    private Node eindNode;
    private List<Node> nodes = new ArrayList<Node>();
    private List<Node> pad = new ArrayList<Node>();

    public Reis(Node beginNode, Node eindNode) {
        this.beginNode = beginNode;
        this.eindNode = eindNode;
    }

    public void setNode(List<Node> newPad) {
        this.pad = newPad;
    }

    public void setPad(List<Node> newPad) {
        this.pad = newPad;
    }

    public List<Node> getPad() {
        return pad;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void addNode(Node node) {
        this.nodes.add(node);
    }

    private void setBeginNode(Node node) {
        this.beginNode = node;
    }

    public void setEindNode(Node eindNode) {
        this.eindNode = eindNode;
    }

    public void calculateBestPath() {
        Node currentNode = beginNode;
        List<Node> visitedNodes = new ArrayList<Node>();
        currentNode.setAfstand(0);

        System.out.println(currentNode.getNeighbours().get(0) instanceof Rit);

        while (visitedNodes.size() != nodes.size()) {
            // Blijf dit doen, tot we alle nodes hebben bezocht.

            for (Stap stap:currentNode.getNeighbours()) {
                // Loop door alle connecties met de huidige node
                Node key = stap.getEindNode();
                Double value = stap.getWeight();

                if (key.getAfstand() > value + currentNode.getAfstand()) {
                    key.setAfstand(value + currentNode.getAfstand());
                }
            }

            // Zoek de volgende node waarvan we gaan bepalen wat het kortste pad is.
            visitedNodes.add(currentNode);
            double smallest = Integer.MAX_VALUE;

            // Loop door alle stappen
            for (Stap stap : currentNode.getNeighbours()) {
                // Als de stap.korsteAfstand kleiner is dan smallest EN de stap.EindNode is niet de beginNode EN de node
                // is nog niet in "visitedNodes", zet dan de Node als de volgende node die we gaan bezoeken.
                // Dit zullen we blijven doen totdat visitedNodes alle Nodes heeft bezocht.
                if ((stap.getEindNode().getAfstand() < smallest) && (stap.getEindNode() != beginNode) && (!visitedNodes.contains(stap.getEindNode()))) {
                    smallest = stap.getEindNode().getAfstand();
                    currentNode = stap.getEindNode();
                }
            }
        }
        System.out.println(eindNode.getAfstand());
    }

    public String toString(){
        return "Pad: " + this.getPad();
    }

    @Override
    public String compareTo(List<Node> pad) {
        // Return het pad dat beter is.
        double totaldistance1 = 0;
        double totaldistance2 = 0;
        this.pad = this.getPad();
        for (Node node:this.getPad()) {
            totaldistance1 += node.getAfstand();
        }
        for (Node node:pad) {
            totaldistance2 += node.getAfstand();
        }
        if (totaldistance1 < totaldistance2) {
            return "Het pad: " + this.getPad() + " is beter dan het pad " + pad;
        }
        else if (totaldistance2 > totaldistance1) {
            return "Het pad: " + pad + " is beter dan het pad " + this.getPad();
        }
        else {
            return "Het pad: " + this.getPad() + " is even goed als het pad " + pad;
        }
    }
}