package Opdracht1;
import java.sql.Array;
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
        // Zet de afstand van de eerste node op 0
        currentNode.setAfstand(0);

        while (visitedNodes.size() != nodes.size()) {
            // Blijf dit doen, tot we alle nodes hebben bezocht.

            for (Stap stap:currentNode.getNeighbours()) {
                // Loop door alle neighbours van de huidige node.
                Node key = stap.getEindNode();
                Double value = stap.getWeight();

                // Als de afstand van de node groter is dan de huidige node + weight, verander hem.
                if (key.getAfstand() > value + currentNode.getAfstand()) {
                    key.setAfstand(value + currentNode.getAfstand());
                    key.setBestVorigeNode(currentNode);
                }
            }

            // Zoek de volgende node waarvan we gaan bepalen wat het kortste pad is.
            visitedNodes.add(currentNode);
            double smallest = Integer.MAX_VALUE;

            for (Stap stap : currentNode.getNeighbours()) {
                // If statement met: 1. de afstand van de eindnode van de stap is kleiner dan smallest
                // 2. De node is niet de beginNode
                // 3. De eindNode zit niet in visitedNodes
                // Als dat allemaal waar is, dan wordt die node de volgende node die we gaan bezoeken.
                if ((stap.getEindNode().getAfstand() < smallest) && (stap.getEindNode() != beginNode) && (!visitedNodes.contains(stap.getEindNode()))) {
                    smallest = stap.getEindNode().getAfstand();
                    currentNode = stap.getEindNode();
                }
            }
        }
        List<Node> path = new ArrayList<Node>(Arrays.asList(eindNode));
        currentNode = eindNode;
        while (!path.contains(beginNode)) {
            path.add(0, currentNode.getBestVorigeNode());
            currentNode = currentNode.getBestVorigeNode();
        }
        this.setPad(path);
    }

    public String toString(){
        return "Pad: " + this.getPad();
    }

    @Override
    public String compareTo(Reis reis) {
        // Return de reis dat beter is.
        double total1 = 0;
        double total2 = 0;
        System.out.println(beginNode.getNeighbours().get(0) instanceof Rit);
        return "test";

        // Check wat voor type de stap is.
        if (beginNode.getNeighbours().get(0) instanceof Rit) {

        }
    }
}