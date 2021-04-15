package autoverhuur;

public class Auto {
    private String type;
    private double PrijsPerDag;

    public Auto(String tp, double prPd){
        this.type = tp;
        this.PrijsPerDag = prPd;
    }

    public void setPrijsPerDag(double prPd) {
        this.PrijsPerDag = prPd;
    }

    public double getPrijsPerDag(){
        return this.PrijsPerDag;
    }

    public String toString(){
        return ("autotype: " + this.type + " met prijs per dag: " + this.getPrijsPerDag());
    }
}
