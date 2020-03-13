/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesProgrammes;

import LesClasses.LeJeu;
import lesIHM.FenetreJeuConstellation;

/**
 *
 * @author luc.bournel
 */
public class TestFenetreJeuConstellation {
    public static void main(String[] args) throws Exception{
        LeJeu.charger();
        LeJeu.affecterMauvaiseReponses();
        FenetreJeuConstellation fenetre = new FenetreJeuConstellation(LeJeu.getLesConstellations().get(0));
        fenetre.setVisible(true);
    }
}
