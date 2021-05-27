package Opdracht1;

import java.util.List;

public class Rit extends Reis {

    public Rit(Node beginNode, Node eindNode) {
        super(beginNode, eindNode);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String compareTo(Rit andereRit) {
        // Return het pad dat beter is.
        double totaldistance1 = 0;
        double totaldistance2 = 0;

        for (Node node:this.getPad()) {
            totaldistance1 += node.getAfstand();
        }
        for (Node node:andereRit.getPad()) {
            totaldistance2 += node.getAfstand();
        }
        if (totaldistance1 < totaldistance2) {
            return "Het pad: " + this.getPad() + " is " + (totaldistance2 - totaldistance1) + " kilometer korter dan het pad " + andereRit.getPad();
        }
        else if (totaldistance2 > totaldistance1) {
            return "Het pad: " + andereRit.getPad() + " is " + (totaldistance1 - totaldistance2) + " kilometer korter dan het pad " + this.getPad();
        }
        else {
            return "Het pad: " + this.getPad() + " is even lang als het pad " + andereRit.getPad();
        }
    }
}
