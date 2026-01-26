public class App {
    public static void main(String[] args) throws Exception {
            double ordonnees, abscisse;

            Scanner sc= new Scanner(System.in);

            System.out.println(" vous allez creer un point sur un repère orthonormé :\n");
            System.out.print("----------------------------------------------------\n");
            System.out.println("Veuilez saisir l'abcisse du point A :");
            abscisse=sc.nextDouble();

            System.out.println("Veuillez saisir l'ordonnée du Point A :");
            ordonnees= sc.nextDouble();

            Point A = new Point(abscisse,ordonnees);

            System.out.print("----------------------------------------------------\n"); 
            
            System.out.println("Affichage du Point A :");

            System.out.println(A);
     System.out.print("----------------------------------------------------\n");
            A.seDeplacer(5, 5);
             System.out.println(" Après deplacement vectoriel :"+ A);
              System.out.print("----------------------------------------------------\n");
             Point symX= A.symAbcisse();
             Point symY= A.SymOrdonnees();
             Point symO= A.symOrigine();
             System.out.println("Point symétrique / abcisse :"+symX+"\n point symétrique / ordonnées :"+symY +"\n Point symétrique / point origine : "+symO );   
             
             System.out.println("Calcul de la distance entre le point A et son symetrique par rapport à l'axe des abcisse symX :");
             double res= A.calculDistance(symX);
             System.out.printf(" %.0f cm",res );

             sc.close();

    }
}
 
