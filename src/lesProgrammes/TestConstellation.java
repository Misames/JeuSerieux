package lesProgrammes;

import LesClasses.Constellation;
import LesClasses.Etoile;
import java.util.ArrayList;

public class TestConstellation {

    public static void main(String[] args) {
        ArrayList<Etoile> etoiles = new ArrayList<Etoile>();
        etoiles.add(new Etoile("Pollux", 1.86f, 8.8f, 32));
        etoiles.add(new Etoile("Castor", 2.15f, 2.3f, 30));
        etoiles.add(new Etoile("Alhena", 2.8f, 4.4f, 160));
        etoiles.add(new Etoile("Mebsuta", 7f, 4.4f, 31));
        Constellation gemeaux = new Constellation(2, "Gemeaux", "gemeaux.gif", "hiver", etoiles);
        gemeaux.setlaMauvaiseRep(new Etoile("Regulus", 3.5f, 3.15f, 150));
        System.out.println("Nb d'étoiles: " + gemeaux.getNbEtoiles());
    }
}
