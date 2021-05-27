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
        Stap [] stappen = new Stap [nodes.size()];
        List<Node> visitedNodes = new ArrayList<Node>();

        // Maak 6 stappen voor alle nodes
        for (int i = 0; i < nodes.size(); i++) {
            stappen[i] = new Stap(nodes.get(i));
            stappen[i].setKorsteAfstand(Integer.MAX_VALUE);
            stappen[i].setVorigeNode(beginNode);
        }

        // De afstand van de eerste node is 0
        beginNode.setAfstand(0);
        stappen[0].setKorsteAfstand(0);
        stappen[0].setVorigeNode(beginNode);

        while (visitedNodes.size() != nodes.size()) {
            // Blijf dit doen, tot we alle nodes hebben bezocht.
            for ( Map.Entry<Node, Double> entry : currentNode.getVerbondenLocaties().entrySet() ) {
                // Loop door alle connecties met de huidige node
                Node key = entry.getKey();
                Double value = entry.getValue();

                // Loop door alle stappen
                for (Stap stap : stappen) {

                    // Zoek de correcte stap, waarvoor we een connectie hebben
                    if (stap.getEindNode() == key) {

                        // Als stap.eindNode() groter is dan value + currentNode.afStand, verander hem.
                        if (stap.getEindNode().getAfstand() > value + currentNode.getAfstand()) {

                            stap.setVorigeNode(currentNode);
                            stap.setKorsteAfstand(value + stap.getVorigeNode().getAfstand());
                            stap.getEindNode().setAfstand(value + stap.getVorigeNode().getAfstand());

                        }
                    }
                }
            }
            // Zoek de volgende node waarvan we gaan bepalen wat het kortste pad is.
            visitedNodes.add(currentNode);
            double smallest = Integer.MAX_VALUE;

            // Loop door alle stappen
            for (Stap stap : stappen) {
                // Als de stap.korsteAfstand kleiner is dan smallest EN de stap.EindNode is niet de beginNode EN de node
                // is nog niet in "visitedNodes", zet dan de Node als de volgende node die we gaan bezoeken.
                // Dit zullen we blijven doen totdat visitedNodes alle Nodes heeft bezocht.
                if ((stap.getKorsteAfstand() < smallest) && (stap.getEindNode() != beginNode) && (visitedNodes.contains(stap.getEindNode()) == false)) {
                    smallest = stap.getKorsteAfstand();
                    Node shortestNode = stap.getEindNode();
                    currentNode = shortestNode;
                }
            }
        }
        List<Node> pad = new ArrayList<Node>();
        Node searchNode = eindNode;
        boolean finished = false;

        while (finished == false) {
            for (Stap stap : stappen) {
                if (stap.getEindNode() == searchNode) {
                    pad.add(0, stap.getEindNode());
                    searchNode = stap.getVorigeNode();
                }
                if (pad.contains(beginNode)) {
                    finished = true;
                }
            }
        }
        this.pad = pad;
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