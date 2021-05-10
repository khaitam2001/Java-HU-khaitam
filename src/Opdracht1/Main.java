package Opdracht1;

public class Main {
    public static void main(String[] args) {
        Node s0 = new Node("s0");
        Machine f = new Machine("BAAB", s0);
        System.out.println(f.toList());
    }
}
