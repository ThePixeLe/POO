/**
 * @author LSoilihi
 * @version 1.1
 * @created 26-janv.-2026
 */
public class CompteBancaire {

    // Attributs privés
    private int numero;
    private String nomProprietaire;
    private double solde;
    private double decouvertAutorise;
  
    // --- Constructeurs ---

    public CompteBancaire() {
        this.numero = 1258745621;
        this.nomProprietaire = "pierre";
        this.solde = 400;
        this.decouvertAutorise = 1000;
    }

    public CompteBancaire(int _num, String _nomProprio, double _solde, double _decouvertAutorise) {
        this.numero = _num;
        this.nomProprietaire = _nomProprio;
        this.solde = _solde;
        this.decouvertAutorise = _decouvertAutorise;
    }

    // --- Accesseurs (Getters) et Mutateurs (Setters) ---

    public String getnomProprietaire() {
        return nomProprietaire;
    }

    public int getnumero() {
        return numero;
    }

    public double getsolde() {
        return solde;
    }

    public void setsolde(double newVal) {
        this.solde = newVal;
    }

    public double getdecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setdecouvertAutorise(double newVal) {
        this.decouvertAutorise = newVal;
    }

    // --- Méthodes de gestion du compte ---

    /**
     * Ajoute un montant au solde
     */
    public void crediter(double montant) {
        if (montant > 0) {
            this.solde += montant;
        }
    }

    /**
     * Retire un montant si le découvert autorisé le permet
     * @return true si l'opération a réussi, false sinon
     */
    public boolean debiter(double montant) {
        if (montant > 0 && (this.solde - montant) >= -this.decouvertAutorise) {
            this.solde -= montant;
            return true;
        }
        return false;
    }

    /**
     * Transfère un montant du compte courant vers un autre compte
     */
    public boolean transfert(double montant, CompteBancaire autreCompte) {
        if (this.debiter(montant)) {
            autreCompte.crediter(montant);
            return true;
        }
        return false;
    }

    /**
     * Compare le solde du compte courant avec un autre compte
     */
    public boolean superieur(CompteBancaire autreCompte) {
        return this.solde > autreCompte.getsolde();
    }



    // --- Affichage ---

    @Override
    public String toString() {
        return "Compte n°" + numero + " [" + nomProprietaire + "] | Solde : " + solde + " euro | Découvert autorisé : " + decouvertAutorise + " euro ";
    }
}