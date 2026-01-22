public class Television {

    // Méthodes publiques = CE QUE TU PEUX FAIRE

    public void allumer ()  {
        System.out.println("TV allumée");
    }


    public class Main {
        public static void main(String[] args) {
            Television maTV = new Television();




            // CE QUE JE PEUX FAIRE : 

            maTV.allumer();       // OK
        }
    }
}
