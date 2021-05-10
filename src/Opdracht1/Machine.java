package Opdracht1;
import java.util.*;

public class Machine {
    private String Letters;
    private Node BeginNode;

    public Machine(String letters, Node beginNode) {
        Letters = letters;
        BeginNode = beginNode;
    }

    public List toList() {
        List Nodes = new ArrayList();
        Nodes.add(BeginNode);
        Node currentNode = BeginNode;
        for (int i = 0; i < Letters.length(); i += 1) {
            if (Letters.substring(i,i+1) == "A") {
                currentNode = currentNode.getNodeA();
                Nodes.add(currentNode);
            }
            else if (Letters.substring(i,i+1) == "B") {
                currentNode = currentNode.getNodeB();
                Nodes.add(currentNode);
            }
            else {
                System.out.println("Error");
            }
        }
        return Nodes;
    }
}
