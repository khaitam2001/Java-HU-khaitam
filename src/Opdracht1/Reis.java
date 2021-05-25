package Opdracht1;
import java.util.*;
// SOURCES = https://www.baeldung.com/java-dijkstra en https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-greedy-algo-7/

public class Reis implements Comparable {
    private Node beginNode;
    private Node eindNode;
    private List<Node> nodes = new ArrayList<Node>();

    public Reis(Node beginNode, Node eindNode) {
        this.beginNode = beginNode;
        this.eindNode = eindNode;
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

    @Override
    public void compareTo() {
        Node currentNode = beginNode;
        boolean shortestFound = false;
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
        System.out.println(stappen.length);
        stappen[0].setKorsteAfstand(0);
        stappen[0].setVorigeNode(beginNode);

        for ( Stap stap : stappen) {
            System.out.println(stap);
        }

        while (visitedNodes.size() != nodes.size()) {
            for ( Map.Entry<Node, Double> entry : currentNode.getVerbondenLocaties().entrySet() ) {
                Node key = entry.getKey();
                Double value = entry.getValue();

                // Loop door alle stappen
                for (Stap stap : stappen) {

                    // Zoek de correcte stap, waarvoor we een connectie hebben
                    if (stap.getEindNode() == key) {

                        // Als die stap groter is dan value + de afstand van de vorige node, verander hem.
                        if (stap.getEindNode().getAfstand() > value + stap.getVorigeNode().getAfstand()) {
                            System.out.println(stap.getEindNode());
                            System.out.println(stap.getEindNode().getAfstand());
                            System.out.println();

                            stap.setVorigeNode(currentNode);
                            stap.setKorsteAfstand(value + stap.getVorigeNode().getAfstand());
                            stap.getEindNode().setAfstand(value + stap.getVorigeNode().getAfstand());

                        }
                    }
                }
            }
            visitedNodes.add(currentNode);
            double smallest = Integer.MAX_VALUE;
            for (Stap stap : stappen) {
                System.out.println(stap);
                if ((stap.getKorsteAfstand() < smallest) && (stap.getEindNode() != beginNode) && (visitedNodes.contains(stap.getEindNode()) == false)) {
                    smallest = stap.getKorsteAfstand();
                    Node shortestNode = stap.getEindNode();
                    currentNode = shortestNode;
                }
            }
            System.out.println("\n");
//            System.out.println("Key: " + key + " Value: " + value);
        }
    }

    public String toString(){
        return "Nodes: " + this.nodes;
    }
}