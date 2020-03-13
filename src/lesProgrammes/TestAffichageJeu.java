package lesProgrammes;

import LesClasses.LeJeu;

/**
 *
 * @author luc.bournel
 */
public class TestAffichageJeu {

    public static void main(String[] args) throws Exception {
        LeJeu.charger();
        LeJeu.affecterMauvaiseReponses();
        LeJeu.afficherJeu();
    }
}
