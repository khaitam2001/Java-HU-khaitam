package Opdracht1;

public class Stap {
    private Node vorigeNode;
    private Node eindNode;
    private double korsteAfstand;
    private boolean sptSet;

    public Stap(Node eindNode) {
        this.eindNode = eindNode;
    }

    public boolean isSptSet() {
        return sptSet;
    }

    public void setSptSet(boolean sptSet) {
        this.sptSet = sptSet;
    }

    public Node getVorigeNode() {
        return vorigeNode;
    }

    public void setVorigeNode(Node beginNode) {
        this.vorigeNode = beginNode;
    }

    public Node getEindNode() {
        return eindNode;
    }

    public void setEindNode(Node eindNode) {
        this.eindNode = eindNode;
    }

    public double getKorsteAfstand() {
        return korsteAfstand;
    }

    public void setKorsteAfstand(double korsteAfstand) {
        this.korsteAfstand = korsteAfstand;
    }

    public String toString() {
        return "Vorige: " + vorigeNode + " Eind: " + eindNode + " Afstand: " + korsteAfstand;
    }
}
