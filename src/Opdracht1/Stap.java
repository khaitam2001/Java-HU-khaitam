package Opdracht1;

public class Stap {
    private Node beginNode;
    private Node eindNode;
    private double weight;

    public Stap(Node beginNode, Node eindNode, double weight) {
        this.beginNode = beginNode;
        this.eindNode = eindNode;
        this.weight = weight;
    }

    public Node getBeginNode() {
        return beginNode;
    }

    public void setBeginNode(Node beginNode) {
        this.beginNode = beginNode;
    }

    public double getWeight() {
        return weight;
    }

    public Node getEindNode() {
        return eindNode;
    }

    public void setEindNode(Node eindNode) {
        this.eindNode = eindNode;
    }

    public String toString() {
        return "Begin: " + beginNode + " Eind: " + eindNode;
    }
}
