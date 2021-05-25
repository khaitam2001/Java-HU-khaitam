package Opdracht1;

public class Stap {
    private Node beginNode;
    private Node eindNode;
    private double korsteAfstand;

    public Stap(Node eindNode) {
        this.eindNode = eindNode;
    }

    public Node getBeginNode() {
        return beginNode;
    }

    public void setBeginNode(Node beginNode) {
        this.beginNode = beginNode;
    }

    public double getKorsteAfstand() {
        return korsteAfstand;
    }

    public void setKorsteAfstand(double korsteAfstand) {
        this.korsteAfstand = korsteAfstand;
    }
}
