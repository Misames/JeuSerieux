package lesClasses;

/**
 * <p>
 * Cette classe mémorise en mémoire centrale une étoile caractérisée par les
 * données suivantes:
 * <ul>
 * <li>l'appellation de l'étoile</li>
 * <li>la masse de l'étoile</li>
 * <li>le rayon de l'étoile</li>
 * <li>la luminosité de l'étoile</li>
 * </ul>
 *
 * @author Groupe n°6 : Bournel Luc, Bouscaillou François
 */
public class Etoile {

    /**
     * appellation : appellation de l'étoile
     *
     * @see Etoile#getAppellation()
     * @see Etoile#setAppellation(java.lang.String)
     */
    private String appellation;

    /**
     * masse : masse de l'étoile
     *
     * @see Etoile#getMasse()
     * @see Etoile#setMasse(float)
     */
    private float masse;

    /**
     * rayon : rayon de l'étoile
     *
     * @see Etoile#getRayon()
     * @see Etoile#setRayon(float)
     */
    private float rayon;

    /**
     * luminosité : luminosité de l'étoile
     *
     * @see Etoile#getLuminosite()
     * @see Etoile#setLuminosite(float)
     */
    private float luminosite;

    /**
     * Constructeur de la classe Etoile qui initialise masse, rayon, luminosite
     * à 0
     *
     * @param leNom le nom de l'étoile
     */
    public Etoile(String leNom) {
        appellation = leNom;
        masse = 0;
        rayon = 0;
        luminosite = 0;
    }

    /**
     * Constructeur de la classe Etoile
     *
     * @param leNom nom de l'étoile
     * @param laMasse masse de l'étoile
     * @param leRayon rayon de l'étoile
     * @param laLuminosite luminosite de l'étoile
     */
    public Etoile(String leNom, float laMasse, float leRayon, float laLuminosite) {
        appellation = leNom;
        masse = laMasse;
        rayon = leRayon;
        luminosite = laLuminosite;
    }

    /**
     * Accesseur en consultation de la donnée privée appellation
     *
     * @return appellation - appellation de l'étoile
     */
    public String getAppellation() {
        return appellation;
    }

    /**
     * Accesseur en modification de la donnée privée appellation
     *
     * @param laNvappellation la nouvelle appellation de l'étoile
     */
    public void setAppellation(String laNvappellation) {
        appellation = laNvappellation;
    }

    /**
     * Accesseur en consultation de la donnée privée masse
     *
     * @return masse - masse de l'étoile
     */
    public float getMasse() {
        return masse;
    }

    /**
     * Accesseur en modification de la donnée privée masse
     *
     * @param laNvmasse la nouvelle masse de l'étoile
     */
    public void setMasse(float laNvmasse) {
        masse = laNvmasse;
    }

    /**
     * Accesseur en consultation de la donnée privée rayon
     *
     * @return rayon - rayon de l'étoile
     */
    public float getRayon() {
        return rayon;
    }

    /**
     * Accesseur en modification de la donnée privée rayon
     *
     * @param leNvrayon le nouveau rayon de l'étoile
     */
    public void setRayon(float leNvrayon) {
        rayon = leNvrayon;
    }

    /**
     * Accesseur en consultation de la donnée privée luminosite
     *
     * @return luminosite - luminosité de l'étoile
     */
    public float getLuminosite() {
        return luminosite;
    }

    /**
     * Accesseur en modification de la donnée privée luminosite
     *
     * @param laNvluminosite la nouvelle luminosité de l'étoile
     */
    public void setLuminosite(float laNvluminosite) {
        luminosite = laNvluminosite;
    }
}
