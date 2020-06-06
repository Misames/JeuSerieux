package lesClasses;

import java.awt.Color;
import java.util.ArrayList;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import lesIHM.FenetreAffichageConstellation;
import lesIHM.FenetreJeuConstellation;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

/**
 * <p>
 * Cette classe assure le fonctionnement du jeu en regroupant différentes
 * méthodes utilisées dans le jeu. Elle est caractérisée par les données
 * suivantes :
 * <ul>
 * <li>la possibilité d'afficher les images par secondes</li>
 * <li>le nombre d'images par secondes</li>
 * <li>la liste des constellations</li>
 * <li>le nombre de secondes de réflexion pour chaque question</li>
 * <li>la couleur principale du jeu utilisée notamment par les boutons</li>
 * <li>la couleur secondaire du jeu utilisée notamment pour l'arrière-plan du
 * jeu</li>
 * <li>la couleur du texte dans le jeu</li>
 * </ul>
 *
 * @author Groupe n°6 : Bournel Luc, Bouscaillou François
 */
public class LeJeu {

    /**
     * showFPS : indique si l'utilisateur souhaite afficher les images par
     * secondes
     *
     * @see LeJeu#isShowFPS()
     * @see LeJeu#setShowFPS(boolean)
     */
    private static boolean showFPS = false;

    /**
     * framesPerSeconds : nombre d'images par secondes du jeu
     */
    private static short framesPerSeconds = 0;

    /**
     * lesConstellations : liste des constellations contenues dans le fichier
     * XML
     *
     * @see LeJeu#getLesConstellations()
     */
    private static ArrayList<Constellation> lesConstellations = new ArrayList<Constellation>();

    /**
     * seconds : nombre de secondes de réflexion pour chaque question
     *
     * @see LeJeu#getSeconds()
     * @see LeJeu#setSeconds(int)
     */
    private static int seconds = 10;

    /**
     * primaryColor : couleur principale du jeu
     *
     * @see LeJeu#getPrimaryColor()
     * @see LeJeu#setPrimaryColor(java.awt.Color)
     */
    private static Color primaryColor = new Color(57, 0, 101);

    /**
     * secondaryColor : couleur secondaire du jeu
     *
     * @see LeJeu#getSecondaryColor()
     * @see LeJeu#setSecondaryColor(java.awt.Color)
     */
    private static Color secondaryColor = new Color(0, 1, 107);

    /**
     * textColor : couleur du texte
     *
     * @see LeJeu#getTextColor()
     * @see LeJeu#setTextColor(java.awt.Color)
     */
    private static Color textColor = new Color(255, 255, 255);

    /**
     * Accesseur en consultation de la donnée privée primaryColor
     *
     * @return primaryColor - la couleur principale
     */
    public static Color getPrimaryColor() {
        return primaryColor;
    }

    /**
     * Accesseur en modification de la donnée privée primaryColor
     *
     * @param color la nouvelle couleur principale
     */
    public static void setPrimaryColor(Color color) {
        primaryColor = color;
    }

    /**
     * Accesseur en consultation de la donnée privée secondaryColor
     *
     * @return secondaryColor - la couleur secondaire
     */
    public static Color getSecondaryColor() {
        return secondaryColor;
    }

    /**
     * Accesseur en modification de la donnée privée secondaryColor
     *
     * @param color la nouvelle couleur secondaire
     */
    public static void setSecondaryColor(Color color) {
        secondaryColor = color;
    }

    /**
     * Accesseur en consultation de la donnée privée textColor
     *
     * @return textColor - la couleur du texte
     */
    public static Color getTextColor() {
        return textColor;
    }

    /**
     * Accesseur en modification de la donnée privée textColor
     *
     * @param color la nouvelle couleur du texte
     */
    public static void setTextColor(Color color) {
        textColor = color;
    }

    /**
     * Accesseur en consultation de la donnée privée seconds
     *
     * @return seconds - le nombre de secondes de réflexion pour chaque question
     */
    public static int getSeconds() {
        return seconds;
    }

    /**
     * Accesseur en modification de la donnée privée seconds
     *
     * @param seconds le nouveau nombre de secondes de réflexion pour chaque
     * question
     */
    public static void setSeconds(int seconds) {
        LeJeu.seconds = seconds;
    }

    /**
     * Accesseur en consultation de la donnée privée showFPS
     *
     * @return showFPS - est-ce que l'utilisateur veut afficher les images par
     * secondes ?
     */
    public static boolean isShowFPS() {
        return showFPS;
    }

    /**
     * Accesseur en modification de la donnée privée showFPS
     *
     * @param showFPS indique si l'utilisateur veut afficher le nombre d'images
     * par secondes
     */
    public static void setShowFPS(boolean showFPS) {
        LeJeu.showFPS = showFPS;
    }

    /**
     * Parcours la liste de toutes les constellations et cherchent des étoiles
     * au hasard afin de les affecter comme mauvaise réponse dans les
     * constellations.
     *
     * @return la liste des étoiles qui vont être affectées comme mauvaise
     * réponses
     */
    private static ArrayList<Etoile> rechercherMauvaisesReponses() {
        ArrayList<Etoile> lesMauvaisesRep = new ArrayList<Etoile>();
        Constellation objConstelAlea;
        Etoile objEtoileAlea;

        int taille = lesConstellations.size();
        int numConstellationAlea;
        int numEtoileAlea;

        for (int i = 0; i < taille; i++) {
            numConstellationAlea = 0;
            do {
                numConstellationAlea = (int) (Math.random() * (taille - 0));
            } while (numConstellationAlea == i);

            objConstelAlea = lesConstellations.get(numConstellationAlea);

            numEtoileAlea = (int) (Math.random() * (3 - 0));
            objEtoileAlea = objConstelAlea.getLaListeEtoiles().get(numEtoileAlea);

            lesMauvaisesRep.add(objEtoileAlea);
        }

        return lesMauvaisesRep;
    }

    /**
     * Affectent une mauvaise réponse à chaque constellation.
     */
    public static void affecterMauvaiseReponses() {
        ArrayList<Etoile> etoiles = rechercherMauvaisesReponses();
        int number;

        for (int i = 0; i < lesConstellations.size(); i++) {
            lesConstellations.get(i).setlaMauvaiseRep(etoiles.get(i));

            number = (int) (Math.random() * (3 - 0));

            lesConstellations.get(i).getLaListeEtoiles().set(number, etoiles.get(i));
        }
    }

    /**
     * Affiche des fenêtres affichant les informations de chaque constellation
     * les unes à la suite des autres. La durée d'affichage de chaque fenêtre
     * est donnée par la donnée privée seconds.Elle renvoie une erreur une
     * exception s'l y a un problème.
     *
     * @throws Exception exception indiquant qu'il y a eu un problème
     */
    public static void afficherApprentissage() throws Exception {
        Thread nouveauFilExecution;
        nouveauFilExecution = new Thread(new Runnable() {
            public void run() {
                for (Constellation constel : lesConstellations) {
                    FenetreAffichageConstellation laNvFenetre;
                    try {
                        laNvFenetre = new FenetreAffichageConstellation(constel);
                        laNvFenetre.setVisible(true);
                        Thread.sleep(seconds * 1000);
                        laNvFenetre.dispose();
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }
        );
        nouveauFilExecution.start();
    }

    /**
     * Affiche des fenêtres affichant les informations de chaque constellation
     * les unes à la suite des autres. Chaque fenêtre laisse l'utilisateur
     * cliquer sur ce qu'il pensent être la mauvaise réponse.La durée
     * d'affichage de chaque fenêtre est donnée par la donnée privée
     * seconds.Elle renvoie une erreur une exception s'l y a un problème.
     *
     * @throws Exception exception indiquant qu'il y a eu un problème
     */
    public static void afficherJeu() throws Exception {
        Thread nouveauFilExecution = new Thread(new Runnable() {
            @Override
            public void run() {
                FenetreJeuConstellation laNvFenetre;
                int i = 0;
                boolean ok = false;
                do {
                    try {
                        laNvFenetre = new FenetreJeuConstellation(lesConstellations.get(i));
                        laNvFenetre.setVisible(true);
                        Thread.sleep(seconds * 1000);
                        i++;
                        ok = laNvFenetre.getContinuer();
                        laNvFenetre.dispose();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                } while (i < lesConstellations.size() && ok);
            }
        }
        );
        nouveauFilExecution.start();
    }

    /**
     * Parse le fichier constellation.xml pour stocker les données dans des
     * objets des classes Constellation et Etoile. Renvoie une exception s'il y
     * a une erreur
     *
     * @throws java.lang.Exception exception indiquant qu'il y a eu un problème
     * @see Etoile
     * @see Constellation
     */
    public static void charger() throws Exception {
        Element leNoeudConstellation;
        String nomConstell;
        String imageConstell;
        String saisonConstell;
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
            ArrayList<Etoile> etoiles = new ArrayList<Etoile>();

            String nomEtoile;
            float masseEtoile;
            float rayonEtoile;
            float luminositeEtoile;

            leNoeudConstellation = (Element) i.next();
            nomConstell = leNoeudConstellation.getChild("nom").getText();
            idConstell = leNoeudConstellation.getAttribute("id").getIntValue();
            imageConstell = leNoeudConstellation.getChild("image").getText();
            saisonConstell = leNoeudConstellation.getAttribute("saisonObservation").getValue();

            //xxxxx Etoiles xxxxx
            // System.out.println("Constellation n°" + idConstell + " Nom : " + nomConstell + " Etoiles :");
            lesNoeudsEtoiles = leNoeudConstellation.getChild("lesetoiles").getChildren("etoile");
            j = lesNoeudsEtoiles.iterator();

            while (j.hasNext()) {
                leNoeudEtoile = (Element) j.next();
                // System.out.println(" - " + leNoeudEtoile.getChild("appellation").getText());
                nomEtoile = leNoeudEtoile.getChild("appellation").getText();
                masseEtoile = leNoeudEtoile.getAttribute("masse").getFloatValue();
                rayonEtoile = leNoeudEtoile.getAttribute("rayon").getFloatValue();
                luminositeEtoile = Float.parseFloat(leNoeudEtoile.getChild("luminosite").getText());

                etoiles.add(new Etoile(nomEtoile, masseEtoile, rayonEtoile, luminositeEtoile));
            }

            lesConstellations.add(new Constellation(idConstell, nomConstell, imageConstell, saisonConstell, etoiles));

            Timer timerFPS = new Timer();
            timerFPS.scheduleAtFixedRate(new TimerTask() {
                private int startTime = (int) System.currentTimeMillis();
                private int endTime;
                private int frameTimes = 0;
                private short frames = 0;

                @Override
                public void run() {
                    if (isShowFPS()) {
                        //get the current time  
                        endTime = (int) System.currentTimeMillis();
                        //the difference between start and end times  
                        frameTimes += endTime - startTime;
                        //count one frame  
                        frames++;
                        //if the difference is greater than 1 second (or 1000ms) post the results  
                        if (frameTimes >= 1000) {
                            //post results at the console
                            framesPerSeconds = frames;
                            //reset time differences and number of counted frames  
                            frames = 0;
                            frameTimes = 0;
                            startTime = (int) System.currentTimeMillis();
                        }
                    }
                }
            }, 0, 1);
        }
    }

    /**
     * Affiche le nombre d'images par secondes dans le titre de la fenêtre
     * passée en paramètre sous la forme "Titre - XX ips"
     *
     * @param frame fenêtre où il faut afficher le nombre d'images par secondes
     * @param title titre par défaut de la fenêtre
     */
    public static void afficherFPS(JFrame frame, String title) {
        if (showFPS) {
            frame.setTitle(title + " - " + Short.toString(framesPerSeconds) + " ips");
        } else {
            frame.setTitle(title);
        }
    }

    /**
     * Accesseur en consultation de la donnée privée lesConstellations
     *
     * @return lesConstellations - la liste de toutes les constellations
     */
    public static ArrayList<Constellation> getLesConstellations() {
        return lesConstellations;
    }
}
