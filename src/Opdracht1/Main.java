package Opdracht1;

public class Main {
    public static void main(String[] args) {
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");


        s0.addNodePath("a", s1);
        s0.addNodePath("b", s2);
        System.out.println(s0.getNodePaths().get("a"));
        System.out.println(s0.getNodePaths().get("b"));

    }
}
