package Opdracht1;

public class Game {
    private String naam;
    private double Prijs;

    public Game(String Naam, double prijs) {
        this.naam = Naam;
        this.Prijs = prijs;
    }

    public String getNaam() {
        return naam;
    }

    public double getPrijs() {
        return Prijs;
    }

    public boolean equals(Game newGame) {
        if (this == newGame) return true;
        if (newGame == null || getClass() != newGame.getClass()) return false;

        return this.getNaam() == newGame.getNaam();
    }

    public String toString() {
        return naam + " met een prijs van €" + Prijs;
    }
}
