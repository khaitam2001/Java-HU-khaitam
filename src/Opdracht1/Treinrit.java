package Opdracht1;

public class Treinrit extends Stap{
    private String stapType = "minuten";

    public Treinrit(Node beginNode, Node eindNode, double weight) {
        super(beginNode, eindNode, weight);
    }

    public String getStapType() {
        return stapType;
    }
}
