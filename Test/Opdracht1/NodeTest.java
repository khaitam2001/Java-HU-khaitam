package Opdracht1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    @Test
    public void nodeWordtToegevoegd() {
        Node actual = new Node("Node1");
        actual.addNodePath("Z", actual);
        // We horen true te krijgen, want de node "actual" hoort bij de letter "Z"
        assertEquals(true, actual.getNode("Z").equals(actual));
    }

    @Test
    public void keyBestaatAl() {
        Node actual = new Node("Node1");
        Node testNode = new Node("TestNode");
        actual.addNodePath("Z", actual);
        actual.addNodePath("Z", testNode);
        // We horen false te krijgen, want er hoort geen letter "Z" bij de Node "testNode".
        assertEquals(false, actual.getNode("Z").equals(testNode));
    }
}