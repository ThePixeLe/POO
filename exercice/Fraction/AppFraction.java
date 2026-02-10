public class AppFraction {

    public static void main(String[] args) {
        
        System.out.println("=== TEST QUESTION 2 : CONSTRUCTEURS ===");
        Fraction f1 = new Fraction(12, 7);
        Fraction f2 = new Fraction();  // 0 / 1
        Fraction f3 = new Fraction(9); // 9 / 1
        
        System.out.print("F1 (12, 7) : "); Ecran.Affiche(f1);
        System.out.print("F2 (vide)  : "); Ecran.Affiche(f2);
        System.out.print("F3 (9)     : "); Ecran.Affiche(f3);

        System.out.println("\n=== TEST QUESTION 4 : OPÉRATIONS UNAIRES ===");
        Fraction fOpp = new Fraction(4, 7);
        fOpp.Oppose();
        System.out.print("Opposé de 4/7 : "); Ecran.Affiche(fOpp);
        
        Fraction fInv = new Fraction(4, 7);
        fInv.Inverse();
        System.out.print("Inversé de 4/7 : "); Ecran.Affiche(fInv);

        System.out.println("\n=== TEST QUESTION 5 : RELATIONNEL ===");
        Fraction fA = new Fraction(11, 7);
        Fraction fB = new Fraction(5, 4);
        System.out.println("11/7 > 5/4 ? " + fA.Superieur(fB));
        
        Fraction fC = new Fraction(22, 14);
        System.out.println("11/7 == 22/14 ? " + fA.Egal(fC));

        System.out.println("\n=== TEST QUESTION 6 & 7 : PGCD ET RÉDUCTION ===");
        // Test demandé : 120 / -150 doit donner -4/5
        Fraction fReduc = new Fraction(120, -150);
        System.out.print("120 / -150 réduit donne : ");
        Ecran.Affiche(fReduc);

        System.out.println("\n=== TEST OPÉRATIONS ARITHMÉTIQUES ===");
        Fraction somme = f1.Somme(fB); // 12/7 + 5/4
        System.out.print("Somme 12/7 + 5/4 : "); Ecran.Affiche(somme);
    }
}
