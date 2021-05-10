package Opdracht1;

public class Transactie {
    private Koper Koper;
    private Verkoper Verkoper;
    private Game Verkochte_Game;

    public Transactie(Koper koper, Verkoper verkoper, Game Verkochte_game) {
        this.Koper = koper;
        this.Verkoper = verkoper;
        this.Verkochte_Game = Verkochte_game;
    }

    public void voerTransactieUit(){
        if (Koper.budget < Verkochte_Game.getPrijs()){
            System.out.println(Koper.getNaam() + " heeft niet genoeg geld");
        }
        else if (Verkoper.getGames().contains(Verkochte_Game) == false) {
            System.out.println(Verkoper.getNaam() + " heeft geen '" + Verkochte_Game.getNaam() + "'");
        }
        else if (Koper.getGames().contains(Verkochte_Game) == true) {
            System.out.println(Koper.getNaam() + " heeft de game '" + Verkochte_Game.getNaam() + "' al gekocht.");
        }
        else {
             Koper.addGame(Verkochte_Game);
             Koper.changeBudget(Verkochte_Game.getPrijs());
             Verkoper.changeBudget(Verkochte_Game.getPrijs());
             System.out.println(Koper.getNaam() + " heeft '" + Verkochte_Game.getNaam() + "' gekocht van " + Verkoper.getNaam());
        }
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
        return this.getKoper().getNaam() + " wilt '" + this.getVerkochteGame().getNaam() + "' kopen van " + this.getVerkoper().getNaam();
    }
}
