package Opdracht1;
import java.util.*;

public class Node {
    private String naam;
    private HashMap<String, Node> nodePaths = new HashMap<String, Node>();

    public Node(String naam) {
        this.naam = naam;
    }

    public HashMap<String, Node> getNodePaths() {
        return nodePaths;
    }

    public Node getNode(String letter) {
        return this.getNodePaths().get(letter);
    }

    public void addNodePath(String letter, Node newNode) {
        // Als de HashMap nodePaths een van de letters als key heeft of een van de Nodes als value heeft, dan geeft hij
        // een error
        if (this.getNodePaths().containsKey(letter)) {
            System.out.println("Letter bestaat al");
        }

        else if (this.getNodePaths().containsValue(newNode))
            System.out.println("Node bestaat al");

        else {
            nodePaths.put(letter, newNode);
        }
    }

    @Override
    public String toString() {
        return naam;
    }
}
