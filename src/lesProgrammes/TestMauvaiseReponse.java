package lesProgrammes;

import LesClasses.Constellation;
import LesClasses.Etoile;
import LesClasses.LeJeu;
import java.util.ArrayList;

/**
 *
 * @author luc.bournel
 */
public class TestMauvaiseReponse {
    public static void main(String[] args) throws Exception{
        LeJeu.charger();
        ArrayList<Constellation> lesConstellations = LeJeu.getLesConstellations();

        System.out.println("Constellations initiales : ");
        for (Constellation constellation : lesConstellations) {
            System.out.println(" - Nom: " + constellation.getleNom() + " Nb d'étoiles: " + constellation.getNbEtoiles() + " Etoiles:");
            for (Etoile etoile : constellation.getLaListeEtoiles()) {
                System.out.println("   - " + etoile.getAppellation());
            }
        }
        
        LeJeu.affecterMauvaiseReponses();
        
        System.out.println("\n\nConstellations avec mauvaises réponses : ");
        for (Constellation constellation : lesConstellations) {
            System.out.println(" - Nom: " + constellation.getleNom() + " Nb d'étoiles: " + constellation.getNbEtoiles() + " Etoiles:");
            System.out.println("   - " + constellation.getlaMauvaiseRep().getAppellation() + " (Mauvaise réponse)");
            for (Etoile etoile : constellation.getLaListeEtoiles()) {
                System.out.println("   - " + etoile.getAppellation());
            }
        }
    }
}
