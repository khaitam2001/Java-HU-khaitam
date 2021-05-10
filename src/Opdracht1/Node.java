package Opdracht1;

public class Node {
    private String naam;
    private Node NodeA;
    private Node NodeB;

    public Node(String naam) {
        // Constructor waar naam wordt ingevoerd
        this.naam = naam;
    }

    public Node getNodeA() {
        // Getter methode voor node A
        return NodeA;
    }

    public void setNodeA(Node nodeA) {
        // Setter methode voor node A
        NodeA = nodeA;
    }

    public Node getNodeB() {
        // Getter methode voor node B
        return NodeB;
    }

    public void setNodeB(Node nodeB) {
        // Setter methode voor node B
        NodeB = nodeB;
    }

    @Override
    public String toString() {
        return naam;
    }
}
