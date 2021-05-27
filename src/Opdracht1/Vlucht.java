package Opdracht1;

public class Vlucht extends Stap{
    private String stapType = "euro";

    public Vlucht(Node beginNode, Node eindNode, double weight) {
        super(beginNode, eindNode, weight);
    }

    public String getStapType() {
        return stapType;
    }
}
