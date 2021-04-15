package gameswinkel;
import java.time.*;
import java.lang.Math.*;

public class Games {
    private String naam;
    private int releasejaar;
    private double prijs;

    public Games(String nm, int rljaar, double pr) {
        this.naam = nm;
        this.releasejaar = rljaar;
        this.prijs = pr;
    }

    public String getNaam() {
        return this.naam;
    }

    public int getReleasejaar() {
        return this.releasejaar;
    }

    public double getPrijs() {
        return this.prijs * Math.pow(0.7, LocalDate.now().getYear() - releasejaar);
    }

    public String toString() {
        return this.getNaam() + ", uitgegeven in " + releasejaar + "; nieuwprijs: " + this.prijs + " nu voor: €" + this.getPrijs();
    }
}
