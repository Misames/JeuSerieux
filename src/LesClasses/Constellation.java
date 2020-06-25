package LesClasses;

import java.util.ArrayList;

/**
 * <p>
 * Cette classe mémorise en mémoire centrale une constellation caractérisée par
 * les données suivantes:
 * <ul>
 * <li>l'identifiant d'une constellation</li>
 * <li>le nom d'une constellation</li>
 * <li>le chemin d'une constellation</li>
 * <li>le nom d'une étoile qui n'appartient pas à la constellation</li>
 * <li>une collection d'objets de la classe Etoile</li>
 * </ul>
 *
 * @author Groupe n°6 : Bournel Luc, Bouscaillou François
 */
public class Constellation {

    /**
     * lId : identifiant de la constellation
     *
     * @see Constellation#getlId()
     * @see Constellation#setlId(int)
     */
    private int lId;

    /**
     * leNom : nom de la constellation
     *
     * @see Constellation#getleNom()
     * @see Constellation#setleNom(java.lang.String)
     */
    private String leNom;

    /**
     * lImage : chemin d'accès de l'image de la constellation
     *
     * @see Constellation#getlImage()
     * @see Constellation#setlImage(java.lang.String)
     */
    private String lImage;

    /**
     * laSaison : saison où la constellation est visible
     *
     * @see Constellation#getlaSaison()
     * @see Constellation#setlaSaison(java.lang.String)
     */
    private String laSaison;

    /**
     * laMauvaiseRep : objet de la classe Etoile qui n'appartient pas à la
     * constellation
     *
     * @see Constellation#getlaMauvaiseRep()
     * @see Constellation#setlaMauvaiseRep(LesClasses.Etoile)
     */
    private Etoile laMauvaiseRep;

    /**
     * laListeEtoiles : collection de noms d'étoiles appartenant à la
     * constellation
     *
     * @see Constellation#getLaListeEtoiles()
     * @see Constellation#setLaListeEtoiles(java.util.ArrayList)
     */
    private ArrayList<Etoile> laListeEtoiles;

    /**
     * Constructeur de la classe Constellation
     *
     * @param idC identifiant de la constellation
     * @param nomC nom de la constellation
     * @param imageC chemin d'accès de l'image de la constellation
     * @param saisonC saison où la constellation est visible
     * @param etoiles collection d'étoiles
     */
    public Constellation(int idC, String nomC, String imageC, String saisonC, ArrayList<Etoile> etoiles) {
        lId = idC;
        leNom = nomC;
        lImage = imageC;
        laSaison = saisonC;
        laListeEtoiles = etoiles;
        laMauvaiseRep = null;
    }

    /**
     * Accesseur en consultation de la donnée privée lId
     *
     * @return lId - identifiant de la constellation
     */
    public int getlId() {
        return lId;
    }

    /**
     * Accesseur en modification de la donnée privée lId
     *
     * @param leNvId le nouvel id de la constellation
     */
    public void setlId(int leNvId) {
        lId = leNvId;
    }

    /**
     * Accesseur en consultation de la donnée privée leNom
     *
     * @return leNom - nom de la constellation
     */
    public String getleNom() {
        return leNom;
    }

    /**
     * Accesseur en modification de la donnée privée leNom
     *
     * @param leNvNom le nouveau nom de la constellation
     */
    public void setleNom(String leNvNom) {
        leNom = leNvNom;
    }

    /**
     * Accesseur en consultation de la donnée privée lImage
     *
     * @return lImage - chemin de l'image de la constellation
     */
    public String getlImage() {
        return lImage;
    }

    /**
     * Accesseur en modification de la donnée privée lImage
     *
     * @param laNvImage le nouveau chemin de l'image de la constellation
     */
    public void setlImage(String laNvImage) {
        lImage = laNvImage;
    }

    /**
     * Accesseur en consultation de la donnée privée laSaison
     *
     * @return laSaison - saison où est visible la constellation
     */
    public String getlaSaison() {
        return laSaison;
    }

    /**
     * Accesseur en modification de la donnée privée laSaison
     *
     * @param laNvSaison la nouvelle saison où la constellation est visible
     */
    public void setlaSaison(String laNvSaison) {
        laSaison = laNvSaison;
    }

    /**
     * Accesseur en consultation de la donnée privée laListeEtoiles
     *
     * @return laListeEoiles - liste des étoiles composant la constellation
     */
    public ArrayList<Etoile> getLaListeEtoiles() {
        return laListeEtoiles;
    }

    /**
     * Accesseur en modification de la donnée privée laListeEtoiles
     *
     * @param laNvListeEtoiles la liste des étoiles dans la constellation
     */
    public void setLaListeEtoiles(ArrayList<Etoile> laNvListeEtoiles) {
        laListeEtoiles = laNvListeEtoiles;
    }

    /**
     * Accesseur en consultation de la donnée privée laMauvaiseRep
     *
     * @return laMauvaiseRep - étoile qui n'est pas dans la constellation
     */
    public Etoile getlaMauvaiseRep() {
        return laMauvaiseRep;
    }

    /**
     * Accesseur en modification de la donnée privée laMauvaiseRep
     *
     * @param laNvMauvaiseRep la nouvelle etoile qui n'appartient pas à la
     * constellation
     */
    public void setlaMauvaiseRep(Etoile laNvMauvaiseRep) {
        laMauvaiseRep = laNvMauvaiseRep;
    }

    /**
     * Retourne le nombre d'étoiles contenues dans la donnée privée
     * laListeEtoiles
     *
     * @return laListeEtoiles.size()
     */
    public int getNbEtoiles() {
        return laListeEtoiles.size();
    }
}
