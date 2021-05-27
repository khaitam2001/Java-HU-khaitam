package Opdracht1;

import java.util.List;

public class Rit extends Stap {
    private String stapType = "Kilometers";

    public Rit(Node beginNode, Node eindNode, double weight) {
        super(beginNode, eindNode, weight);
    }
}
