public class CompteEpargne extends Compte {

    // attributs
    private double taux_interet;

    /**
     * constructeur avec paramètres
     * 
     * @param _nomProprio
     * @param _solde
     * @param _decouvertAutorise
     */
    public CompteEpargne(String _nomProprio, double _solde, double _decouvertAutorise, double _taux) {
        super(_nomProprio, _solde, _decouvertAutorise);
        this.taux_interet = _taux;
    }

    // constructeur à vide
    public CompteEpargne() {

    }

    /**
     * accesseur taux_interet
     * 
     */
    public double gettaux_interet() {
        return taux_interet;
    }

    /**
     * modifieur taux_interet
     * 
     * @param newtaux
     */
    public void settaux_interet(double _newtaux) {
        taux_interet = _newtaux;
    }

    /**
     * fonction toString affichant les informations du compte épargne
     * 
     * @return String
     */
    public String toString() {
        return super.toString() + " Taux d'intérêt :" + (this.taux_interet * 100) + "%";
    }

    /**
     * calcul des intérêts annuels en fonction des soldes bimensuels
     * 
     * @param tab24
     * @return double
     */
    public double calculInteretAnnuel(double tab24[]) {
        double sommeInteret = 0;
        for (double solde : tab24) {
            sommeInteret += (solde * taux_interet) / 24.0;

        }
        return sommeInteret;

    }

}
 