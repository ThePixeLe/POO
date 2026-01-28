import java.util.Scanner;

public class AppCompte {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


        
        // Création d'un compte bancaire
        System.out.print("Entrez le numéro du compte : ");
        int numero = sc.nextInt();
        
        System.out.print("Entrez le nom du propriétaire : ");
        String nom = sc.next();
        
        System.out.print("Entrez le découvert autorisé : ");
        double decouvert = sc.nextDouble();

        System.out.print("Entrez le solde initial : ");
        double solde = sc.nextDouble();
        
       CompteBancaire compte = new CompteBancaire(numero, nom, solde, decouvert);
        
        System.out.println("\n=== Informations du compte ===");
        System.out.println(compte);

        
        // Tests des opérations
        System.out.println("\n=== Tests des opérations ===");
        compte.crediter(500);
        System.out.println("Après dépôt de 500 : " + compte.getsolde()); 

        compte.debiter(200);
        System.out.println("Après retrait de 200 : " + compte.getsolde()); 

       boolean resultat = compte.debiter(1000);
        System.out.println("Statut du retrait de 1000 euro : " + (resultat ? "ACCEPTÉ" : "REFUSÉ"));
        System.out.println("Solde final : " + compte.getsolde());
        sc.close();
    }
}
