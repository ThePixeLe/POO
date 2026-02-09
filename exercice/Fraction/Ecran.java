package model;

/**
 * Classe responsable de l'affichage des fractions.
 */
public class Ecran {

    /**
     * Affiche une fraction sous la forme "numerateur / denominateur"
     * @param f La fraction à afficher
     */
    public static void Affiche(Fraction f) {
        if (f != null) {
            System.out.println(f.getNumerateur() + " / " + f.getDenominateur());
        } else {
            System.out.println("Fraction non initialisée (null)");
        }
    }
}
