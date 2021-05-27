package Opdracht1;
import java.sql.Array;
import java.util.*;
// SOURCES = https://www.baeldung.com/java-dijkstra en https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-greedy-algo-7/

public class Reis implements Comparable {
    private String naam;
    private Node beginNode;
    private Node eindNode;
    private List<Node> nodes = new ArrayList<Node>();
    private List<Node> pad = new ArrayList<Node>();

    public Reis(String naam, Node beginNode, Node eindNode) {
        this.naam = naam;
        this.beginNode = beginNode;
        this.eindNode = eindNode;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
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

    public Node getEindNode() {
        return eindNode;
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

    public double calculateDistance(){
        // Berekent de afstand van "this.pad".
        double total = 0;

        // Loop door alle Nodes van pad.
        for (int i = 0; i < pad.size() - 1; i++) {

            // Loop door alle neighbours van die nodes.
            for (Stap neighbour:pad.get(i).getNeighbours()) {

                // Als de beginNode hetzelfde is als pad.get(i) EN eindNode is hetzelfde als pad.get(i + 1), voeg dan
                // de weight toe aan total.
                if (neighbour.getBeginNode() == pad.get(i) && neighbour.getEindNode() == pad.get(i + 1)) {
                    total += neighbour.getWeight();
                }
            }
        }
        return total;
    }

    public boolean padKanBestaan() {
        int count = pad.size() - 1;
        // Returnt false als een er een node is dat geen link heeft met een andere node in pad.
        for (int i = 0; i < pad.size() - 1; i++) {
            for (Stap neighbour:pad.get(i).getNeighbours()) {
                if (neighbour.getBeginNode() == pad.get(i) && neighbour.getEindNode() == pad.get(i + 1)) {
                    // Dit moet 7x waar zijn. Als dat niet zo is, dan is er een node dat niet gelinkt is met een andere node
                    count -= 1;
                }
            }
        }
        if (count != 0) {
            return false;
        }
        else{
            return true;
        }
    }
    @Override
    public String compareTo(Reis reis) {
        // Vergelijkt twee reizen met elkaar. We kijken naar het pad van beide reizen en bekijken welke groter is.
        // Returnt een string waarin staat welke reis beter is.

        // Check of het pad kan bestaan.
        if (this.padKanBestaan() == false) {
            throw new RuntimeException("Het pad: " + this.pad + " kan niet bestaan");
        }
        // Return de reis dat beter is.
        double total1 = this.calculateDistance();
        double total2 = reis.calculateDistance();

        if (total1 > total2) {

            // Check wat voor type Stap het is.
            if (beginNode.getNeighbours().get(0) instanceof Rit myRit) {
                // Check welke groter is dan de ander.
                return reis.getNaam() + " is " + (total1 - total2) + myRit.getStapType() + " korter dan " + this.getNaam();
            }

            else if (beginNode.getNeighbours().get(0) instanceof Vlucht myVlucht) {
                return reis.getNaam() + " is " + (total1 - total2) + myVlucht.getStapType() + " korter dan " + this.getNaam();
            }

            else if (beginNode.getNeighbours().get(0) instanceof Treinrit myTreinrit) {
                return reis.getNaam() + " is " + (total1 - total2) + myTreinrit.getStapType() + " korter dan " + this.getNaam();
            }
        }

        // Dit is hetzelfde als hierboven, maar nu kijken we of total2 groter is dan total1
        else if (total2 > total1) {
            if (beginNode.getNeighbours().get(0) instanceof Rit myRit) {
                return this.getNaam() + " is " + (total2 - total1) + myRit.getStapType() + " korter dan " + reis.getNaam();
            }

            else if (beginNode.getNeighbours().get(0) instanceof Vlucht myVlucht) {
                return this.getNaam() + " is " + (total2 - total1) + myVlucht.getStapType() + " korter dan " + reis.getNaam();
            }

            else if (beginNode.getNeighbours().get(0) instanceof Treinrit myTreinrit) {
                return this.getNaam() + " is " + (total2 - total1) + myTreinrit.getStapType() + " korter dan " + reis.getNaam();
            }
        }
        else{
            return "Het is even groot";
        }
        return "Test";
    }
}