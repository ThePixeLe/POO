public class Banque {
    // Attributes
    private Compte [] comptes;
    private int nbComptes;

    // Constructor
    public Banque () {
        this.comptes = new Compte[20];
        this.nbComptes = 0;
    }

    public void ajouterCompte(int n, double s, double d ) {

    }

    public void init() {
        Compte c1 = new Compte("Haddock", 1000.0, -500);
        Compte c2 = new Compte("Tintin", 2000.0, -1000);
        Compte c3 = new Compte("Tournesol", 1500.0, -1500);
        CompteEpargne c4 = new CompteEpargne("Dupont", 1200.0, 0, 0.015);
        CompteEpargne c5 = new CompteEpargne("Castafiore", 5000, 0, 0.015);
        CompteEpargne c6 = new CompteEpargne("Lampion", 2750, 0, 0.015);
        this.ajouterCompte(c1);
        this.ajouterCompte(c2);
        this.ajouterCompte(c3);
        this.ajouterCompte(c4);
        this.ajouterCompte(c5);
        this.ajouterCompte(c6);
    }

    public void afficherComptes() {
        System.out.println("=== LISTE DES COMPTES ===");
        for (int i = 0; i < nbComptes; i++) {
            System.out.println("Total : " + nbComptes + " compte(s)");
        }
    }



}
