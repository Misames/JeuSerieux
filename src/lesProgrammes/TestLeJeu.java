package lesProgrammes;

import LesClasses.Constellation;
import LesClasses.Etoile;
import LesClasses.LeJeu;
import java.util.ArrayList;

public class TestLeJeu {

    public static void main(String[] args) throws Exception {
        LeJeu.charger();
        ArrayList<Constellation> lesConstellations = LeJeu.getLesConstellations();

        for (Constellation constellation : lesConstellations) {
            System.out.println("Nom: " + constellation.getleNom() + " Nb d'étoiles: " + constellation.getNbEtoiles() + " Etoiles:");
            for (Etoile etoile : constellation.getLaListeEtoiles()) {
                System.out.println(" - " + etoile.getAppellation());
            }
        }
    }

}
