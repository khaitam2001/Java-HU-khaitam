package Opdracht1;
import java.util.*;
import org.junit.jupiter.api.Test;

import java.sql.Array;

import static org.junit.jupiter.api.Assertions.*;

class MachineTest {
    @Test
    public void padWordtCorrectGevolgd() {
        // Hier wordt getest of een pad correct wordt gevolgd met de gegeven letters.
        Node node1 = new Node("node1");
        Node node2 = new Node("node2");
        Node node3 = new Node("node3");

        node1.addNodePath("Z", node2);
        node2.addNodePath("K", node3);
        node3.addNodePath("M", node1);

        Machine machine1 = new Machine("ZKM", node1);
        machine1.FollowPath();
        // We verwachten [node1, node2, node3, node1]
        ArrayList<Node> expected = new ArrayList<>(Arrays.asList(node1, node2, node3, node1));
        assertEquals(expected, machine1.getPath());
    }

    @Test
    public void padBestaatNiet() {
        // Als een node niet bestaat bij een gegeven Node, dan wordt dit netjes afgemaakt.
        Node node1 = new Node("node1");
        Node node2 = new Node("node2");
        Node node3 = new Node("node3");

        node1.addNodePath("Z", node2);
        node2.addNodePath("K", node3);
        node3.addNodePath("M", node1);

        Machine machine1 = new Machine("ZKK", node1);
        machine1.FollowPath();
        // We verwachten [node1, node2, node3], want de laatste letter "K" bestaat niet bij Node3.
        ArrayList<Node> expected = new ArrayList<>(Arrays.asList(node1, node2, node3));
        assertEquals(expected, machine1.getPath());
    }
}