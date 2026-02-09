package model; // Changé 'System' pour éviter les conflits avec Java

/**
 * @version 1.1
 * @created 2026
 */
public class Fraction {

    // Attributs privés (Question 1)
    private int numerateur;
    private int denominateur;

    // --- CONSTRUCTEURS (Question 2) ---

    public Fraction(int n, int d) {
        this.numerateur = n;
        // Sécurité : le dénominateur ne peut pas être nul
        this.denominateur = (d != 0) ? d : 1;
        this.Reduire();
    }

    public Fraction() { // Fraction nulle (0/1)
        this(0, 1);
    }

    public Fraction(int n) { // Fraction entière (n/1)
        this(n, 1);
    }

    // --- ACCESSEURS (Getters) ---

    public int getNumerateur() {
        return numerateur;
    }

    public int getDenominateur() {
        return denominateur;
    }

    // --- LOGIQUE INTERNE (Questions 6 & 7) ---

    /**
     * Calcule le PGCD selon l'algorithme d'Euclide fourni.
     */
    private int GetPgcd() {
        int a = Math.abs(this.numerateur);
        int b = Math.abs(this.denominateur);
        
        if (a == 0 || b == 0) return 1;

        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        return a;
    }

    /**
     * Réduit la fraction et normalise le signe.
     */
    private void Reduire() {
        int pgcd = GetPgcd();
        this.numerateur /= pgcd;
        this.denominateur /= pgcd;

        // Le signe est toujours porté par le numérateur
        if (this.denominateur < 0) {
            this.numerateur = -this.numerateur;
            this.denominateur = -this.denominateur;
        }
    }

    // --- OPÉRATIONS UNAIRES (Question 4) ---

    public void Oppose() {
        this.numerateur = -this.numerateur;
    }

    public void Inverse() {
        if (this.numerateur != 0) {
            int temp = this.numerateur;
            this.numerateur = this.denominateur;
            this.denominateur = temp;
            this.Reduire();
        }
    }

    // --- OPÉRATEURS RELATIONNELS (Question 5) ---

    public boolean Superieur(Fraction unefraction) {
        return (this.numerateur * unefraction.denominateur) > (unefraction.numerateur * this.denominateur);
    }

    public boolean Inferieur(Fraction unefraction) {
        return (this.numerateur * unefraction.denominateur) < (unefraction.numerateur * this.denominateur);
    }

    public boolean Egal(Fraction unefraction) {
        return (this.numerateur * unefraction.denominateur) == (unefraction.numerateur * this.denominateur);
    }

    // --- OPÉRATIONS ARITHMÉTIQUES ---

    public Fraction Somme(Fraction unefraction) {
        int n = (this.numerateur * unefraction.denominateur) + (unefraction.numerateur * this.denominateur);
        int d = this.denominateur * unefraction.denominateur;
        return new Fraction(n, d);
    }

    public Fraction Difference(Fraction unefraction) {
        int n = (this.numerateur * unefraction.denominateur) - (unefraction.numerateur * this.denominateur);
        int d = this.denominateur * unefraction.denominateur;
        return new Fraction(n, d);
    }

    public Fraction Produit(Fraction unefraction) {
        return new Fraction(this.numerateur * unefraction.numerateur, this.denominateur * unefraction.denominateur);
    }

    public Fraction Quotient(Fraction unefraction) {
        return new Fraction(this.numerateur * unefraction.denominateur, this.denominateur * unefraction.numerateur);
    }

    public Fraction Puissance(int exposant) {
        int n = (int) Math.pow(this.numerateur, exposant);
        int d = (int) Math.pow(this.denominateur, exposant);
        return new Fraction(n, d);
    }

    // Nettoyage (non utilisé dans ce TP)
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}