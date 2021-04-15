package gameswinkel;
import java.util.*;

public class Persoon {
    private String naam;
    private double budget;
    private List games = new LinkedList();

    public Persoon(String nm, double budg) {
        this.naam = nm;
        this.budget = budg;
    }

    public List getGames() {
        return this.games;
    }

    public double getBudget() {
        return this.budget;
    }

    public String Koop(Games game) {
        if (this.getGames().contains(game) || this.getBudget() < game.getPrijs())
            return this.naam + " koopt " + game.getNaam() + ": niet gelukt";
        else {
            this.games.add(game);
            this.budget =  this.getBudget() - game.getPrijs();
            return this.naam + " koopt " + game.getNaam() + ": gelukt";
        }
    }

    public String Verkoop(Games game, Persoon koper) {
        if (koper.getGames().contains(game) || koper.getBudget() < game.getPrijs())
            return this.naam + " verkoopt " + game.getNaam() + " aan " + koper.naam + ": niet gelukt";
        else {
            koper.games.add(game);
            koper.budget = koper.getBudget() - game.getPrijs();
            return this.naam + " verkoopt " + game.getNaam() + " aan " + koper.naam + ": gelukt";
        }
    }

    public String toString() {
        return this.naam + " heeft een budget van €" + this.getBudget() + " en bezit de volgende games:\n" + this.getGames();
    }
}
