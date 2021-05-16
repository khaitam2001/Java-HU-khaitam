package Opdracht1;
import java.sql.Array;
import java.util.*;

public class Machine {
    private String letters;
    private Node beginNode;
    private ArrayList<Node> path = new ArrayList<>();

    public Machine(String Letters, Node BeginNode) {
        letters = Letters;
        beginNode = BeginNode;
        path.add(beginNode);
    }

    public void FollowPath() {
        // Loop door alle letters
        Node currentNode = beginNode;
        for (int i = 0; i < this.getLetters().length(); i++){
            String letter = String.valueOf(this.getLetters().charAt(i));

            // Voeg elke keer een nieuwe Node toe aan de ArrayList path
            path.add(currentNode.getNode(letter));
            currentNode = currentNode.getNode(letter);

        }
    }

    public String getLetters() {
        return this.letters;
    }

    public ArrayList<Node> getPath() {
        return path;
    }
}
