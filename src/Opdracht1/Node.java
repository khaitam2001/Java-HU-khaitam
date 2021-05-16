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
        nodePaths.put(letter, newNode);
    }

    @Override
    public String toString() {
        return naam + "\n " + this.getNodePaths();
    }
}
