package lesProgrammes;

import LesClasses.Constellation;
import LesClasses.LeJeu;
import lesIHM.FenetreAffichageConstellation;

/**
 *
 * @author luc.bournel
 */
public class TestFenetreAffichageConstellation {

    public static void main(String[] args) throws Exception {
        LeJeu.charger();
        Constellation uneConstellation = LeJeu.getLesConstellations().get(1);
        FenetreAffichageConstellation laFenetre;
        laFenetre = new FenetreAffichageConstellation(uneConstellation);
        laFenetre.setVisible(true);
    }
}
