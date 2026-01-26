package exercice;

public class ExoPoint {
    // Attributs de la classe

    private double x = 0;
    private double y = 0;

    // proprieter 

     public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }


            public void setX(double newval) {
            this.x = newval;
        }

        public void setY(double newval) {
            this.y = newval;
        }

    // constructeur

    public  ExoPoint() {
        this.x = 0 ;    // this.x fait référence à l'attribut de l'objet, x au paramètre
        this.y = 0 ;    // this.y fait référence à l'attribut de l'objet, y au paramètre
   
    }

    public  ExoPoint(double _X, double _Y) {

        this.x=_X;
        this.y=_Y;

    }


    // Méthodes

    
         public void permuter () {
            double temp=this.x;
            this.x=this.y;
            this.y=temp;
        }

        public void seDeplacer (double _newx, double _newy) {
            this.x=_newx;
            this.y=_newy; 
        }

        public void symAbcisse () {
            ExoPoint symAPoint= new ExoPoint(getX(), -getY());


            return symAPoint;
        }

        public void symOrdonnées () {

        }

        public void symOrigine () {

        }

        /*public class Main {
        public static void main(String[] args) {
            Television maTV = new Television();




            // CE QUE JE PEUX FAIRE : 

            maTV.allumer();       // OK
        }
    } */




      
    
}


