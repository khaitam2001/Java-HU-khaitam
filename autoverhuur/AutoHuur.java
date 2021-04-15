package autoverhuur;

public class AutoHuur {
    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant huurder;

    public AutoHuur(){

    }

    public void setAantalDagen(int aD) {
        this.aantalDagen = aD;
    }

    public void setGehuurdeAuto(Auto gA) {
        this.gehuurdeAuto = gA;
    }

    public Auto getGehuurdeAuto() {
        return this.gehuurdeAuto;
    }

    public void setHuurder(Klant k) {
        this.huurder = k;
    }

    public Klant getHuurder() {
        return this.huurder;
    }

    public double totaalPrijs() {
        return this.aantalDagen * this.getGehuurdeAuto().getPrijsPerDag();
    }

    public String toString() {
        if (getGehuurdeAuto() == null & getHuurder() == null)
            return ("er is geen auto bekend\ner is geen huurder bekend\naantal dagen: 0 en dat kost 0.0\n");
        else if (this.getGehuurdeAuto() == null)
            return ("er is geen auto bekend\n" + this.getHuurder().toString() + "\n" + "aantal dagen: " + this.aantalDagen + " en dat kost 0.0\n");
        else if (getHuurder() == null)
            return (this.getGehuurdeAuto().toString() + "\ner is geen huurder bekend\n" + "aantal dagen: " + this.aantalDagen + " en dat kost 0.0\n");
        else
            return this.getGehuurdeAuto().toString() + "\n" + this.getHuurder().toString() + "\n" + "aantal dagen: " + this.aantalDagen + " en dat kost " + this.totaalPrijs() + "\n";
    }
}
