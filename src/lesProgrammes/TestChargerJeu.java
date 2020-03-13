package lesProgrammes;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class TestChargerJeu {

    public static void main(String[] args) throws Exception {
        Element leNoeudConstellation;
        String nomConstell;
        int idConstell;

        SAXBuilder sxb = new SAXBuilder();
        org.jdom2.Document document = sxb.build(new File("constellation.xml"));

        Element racine = document.getRootElement();

        List lesNoeudsConstellations = racine.getChildren("constellation");
        Iterator i = lesNoeudsConstellations.iterator();

        List lesNoeudsEtoiles;
        Iterator j;
        Element leNoeudEtoile;

        while (i.hasNext()) {
            leNoeudConstellation = (Element) i.next();
            nomConstell = leNoeudConstellation.getChild("nom").getText();
            idConstell = leNoeudConstellation.getAttribute("id").getIntValue();

            System.out.println("Constellation n°" + idConstell + " Nom : " + nomConstell + " Etoiles :");

            lesNoeudsEtoiles = leNoeudConstellation.getChild("lesetoiles").getChildren("etoile");
            j = lesNoeudsEtoiles.iterator();

            while (j.hasNext()) {
                leNoeudEtoile = (Element) j.next();
                System.out.println(" - " + leNoeudEtoile.getChild("appellation").getText());
            }
        }
    }
}
