package Opdracht1;
import java.util.*;

public class Machine {
    private String letters;
    private Node beginNode;
    private ArrayList<Node> path = new ArrayList<>();

    public Machine(String Letters, Node BeginNode) {
        letters = Letters;
        beginNode = BeginNode;
    }

    public void followPath() {
        // Loop door alle letters
        Node currentNode = beginNode;
        path.add(beginNode);
        for (int i = 0; i < this.getLetters().length(); i++){
            String letter = String.valueOf(this.getLetters().charAt(i));

            // Voeg elke keer een nieuwe Node toe aan de ArrayList path
            if (currentNode.getNode(letter) == null) {
                // Als de node niet bestaat, stop dan de loop.
                System.out.println("Node bestaat niet bij de letter: " + letter);
                break;
            }
            else {
                path.add(currentNode.getNode(letter));
                currentNode = currentNode.getNode(letter);
            }


        }
    }

    public String getLetters() {
        return this.letters;
    }

    public ArrayList<Node> getPath() {
        return path;
    }
}
