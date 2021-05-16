package Opdracht1;
import java.util.*;

public class Node {
    private String naam;
    private HashMap<String, Node> nodePaths = new HashMap<String, Node>();

    public Node(String naam) {
        // Constructor waar naam wordt ingevoerd
        this.naam = naam;
    }

    public HashMap<String, Node> getNodePaths() {
        return nodePaths;
    }

    public void addNodePath(String letter, Node newNode) {
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
