import java.time.LocalDateTime;

public class Compte {

    // attributs
    private int numero; 
    private String nom;  
    private double solde;
    private double decouvert;


    // constructeur a vide

    public Compte() {
         LocalDateTime locTimes = LocalDateTime.now();
        this.numero = locTimes.hashCode();
        this.nom = nom;
        this.solde = solde;
        this.decouvert = decouvert;
    }

     // constructeur avec parametre

    public Compte(int numero, String nom,double solde, double decouvert) {
         LocalDateTime locTimes = LocalDateTime.now();
        this.numero = locTimes.hashCode();
        this.nom = nom;
        this.solde = solde;
        this.decouvert = decouvert;
    }

    
}
