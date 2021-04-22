package Opdracht1;

public class Persoon {
    protected String naam;
    private double budget;

    public Persoon(String Naam) {
        naam = Naam;
    }

    public String getNaam() {
        return naam;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double newBudget) {
        budget = newBudget;
    }

    public String toString() {
        return naam + " heeft een budget van " + budget;
    }
}
