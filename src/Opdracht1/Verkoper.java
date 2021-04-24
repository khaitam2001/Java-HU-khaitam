package Opdracht1;
import java.util.*;

public class Verkoper extends Persoon implements Budget{
    private ArrayList games;
    private Persoon persoon;

    public Verkoper(String naam) {
        super(naam);
    }

    public ArrayList getGames() {
        return games;
    }

    @Override
    public void changeBudget(double Kosten) {
        this.budget += Kosten;
    }

    public String toString(){
        return this.getNaam() + " is een verkoper met een budget van " + this.getBudget() + "\nen heeft de games: " + this.getGames();
    }
}
