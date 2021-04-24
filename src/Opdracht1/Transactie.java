package Opdracht1;

public class Transactie {
    private Koper Koper;
    private Verkoper Verkoper;
    private Game Verkochte_Game;

    public Transactie(Koper koper, Verkoper verkoper, Game Verkochte_game) {
        this.Koper = koper;
        this.Verkoper = verkoper;
        this.Verkochte_Game = Verkochte_game;

        Koper.changeBudget(Verkochte_game.getPrijs());
        Koper.addGame(Verkochte_game);
        Verkoper.changeBudget(Verkochte_game.getPrijs());
    }

    public Game getVerkochteGame() {
        return Verkochte_Game;
    }

    public Koper getKoper() {
        return Koper;
    }

    public Verkoper getVerkoper() {
        return Verkoper;
    }

    public String toString() {
        return this.getKoper().getNaam() + " heeft '" + this.getVerkochteGame().getNaam() + "' gekocht van " + this.getVerkoper().getNaam();
    }
}
