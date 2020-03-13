package lesIHM;

import javax.swing.JButton;
import javax.swing.JPanel;

import LesClasses.Connect;

/**
 * FenetreEnregistrement
 */
public class FenetreEnregistrement {


    public FenetreEnregistrement() {
        initComponents();
    }

    private void initComponents() {

    }

    private gestEvent(java.awt.event.ActionEvent evt) {
        JButton source = (JButton) evt.getSource();
        if(source == btnEnregistrer) btnEnregistrer();
        else if(source == btnAnnuler ) btnAnnuler();
    }

    /**
     * Fait la requete SQL d'enregistrement
     */
    private void btnEnregistrer() {

    }

    private void btnAnnuler() {

    }
}