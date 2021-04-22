package Opdracht1;
import java.util.*;

public class Koper extends Persoon {
    private List games;
    private Persoon persoon;

    public Koper(String naam){
        super(naam);
    }

    public List getGames(){
        return games;
    }
}
