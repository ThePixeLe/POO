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

        System.out.println("Tentative de retrait de 1000€... Réussi ? " + compte.debiter(1000.0));
        System.out.println("Solde final : " + compte.getsolde());
        
        // Tests des opérations
        System.out.println("\n=== Tests des opérations ===");
        compte.crediter(500.0);
        System.out.println("Après dépôt de 500 : " + compte.getsolde()); // Devrait être 900

        compte.debiter(200.0);
        System.out.println("Après retrait de 200 : " + compte.getsolde()); // Devrait être 700

        boolean ok = compte.debiter(1000.0);
        System.out.println("Tentative de retrait de 1000... Réussi ? " + ok);
        System.out.println("Solde final : " + compte.getsolde()); // Devrait être -300
        
        sc.close();
    }
}
