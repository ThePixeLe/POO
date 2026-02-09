import java.util.*;

import banque.Banque;
import banque.CompteEpargne;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc= new Scanner(System.in);

        int numCompte;

            Banque maBanque= new Banque(" Credit du Nord");
            maBanque.init();
            maBanque.afficherComptes();
 System.out.println("---------- ajouter un compte et afficher la liste-------------------");

            maBanque.ajouterNouveauCompte("Zohrino", 4000, -2000);

            maBanque.afficherComptes();

System.out.println("---------- afficher les comte de solde maximum !-------------------");
                System.out.println(" compte solde Max :"+ maBanque.rechercherCompteSup());
        
            System.out.println("---------- Recherche d'un compte  par numero !-------------------");
            System.out.println(" Veuillez rechercher saisir un numero de Compte ");

            numCompte= sc.nextInt();
             System.out.println("Resultat recherche par num: "+  maBanque.rendCompte(numCompte));  ;

             sc.close();

    }
}
 
