package Opdracht1;
import java.util.*;

public class Koper extends Persoon implements Budget{
    private ArrayList games = new ArrayList<Game>();
    private Persoon persoon;

    public Koper(String naam){
        super(naam);
    }

    public ArrayList getGames(){
        return games;
    }

    public void addGame(Game newGame) {
        games.add(newGame);
    }

    @Override
    public void changeBudget(double Kosten) {
        this.budget -= Kosten;
    }

    public String toString(){
        return this.getNaam() + " is een koper met een budget van €" + this.getBudget() + "\nen heeft de games: " + this.getGames();
    }
}
