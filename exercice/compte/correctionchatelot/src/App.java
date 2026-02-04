import java.util.*;

import banque.CompteEpargne;

public class App {
    public static void main(String[] args) throws Exception {
        
        CompteEpargne compteHaddock= new CompteEpargne("Haddock", 4000, 0, 0.025);
        
        System.out.println("---------- afficher Compte Epargne-------------------");

        System.out.println(compteHaddock.toString());
        //compteHaddock.settaux_interet(0.035);
        
        Random rnd =new Random();
       
        double [] tab24= new double[24] ;
        tab24[0]=4000;
        for (int i = 1; i < tab24.length; i++) {
            tab24[i]=(double)rnd.nextInt(10001);
            
         
        }    
  System.out.println("---------- afficher valeur du talbleau-------------------");
        System.out.print( "[ ");
  for (double d : tab24) {
            
            System.out.print( d+ " "  );

        }
   System.out.print( "] \n");
 System.out.println("---------- afficher resultat annuel calcul interet-------------------");
        
         double interetCumules= compteHaddock.calculInteretAnnuel(tab24);   

         System.out.printf(" interets annuels versés : %.2f euros", interetCumules);


    }
}
 
