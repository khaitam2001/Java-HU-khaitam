package Opdracht1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");

        s0.addNodePath("A", s2);
        s0.addNodePath("B", s1);
        s1.addNodePath("A", s1);
        s1.addNodePath("B", s2);
        s2.addNodePath("B", s3);
        s3.addNodePath("A", s3);
        s3.addNodePath("B", s0);
        System.out.println(s0.getNode("A"));
        System.out.println(s0.getNode("B"));

        Machine m1 = new Machine("BAAB", s0);
        System.out.println(m1.getLetters()); 
        m1.followPath();
        System.out.println(m1.getPath());

    }
}
