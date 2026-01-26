public class Point {

 // attributs
 private double X;
 private double Y;

 // propriétés

 public double getX() {
  return X;
 }

 public double getY() {
  return Y;
 }

 public void setX(double newVal) {
  this.X = newVal;
 }

 public void setY(double newVal) {
  this.Y = newVal;
 }

 // constructeurs

 public Point() {
  this.X = 0;
  this.Y = 0;
 }

 public Point(double _X, double _Y) {

  this.X = _X;
  this.Y = _Y;

 }

 /**
  * 
  * 
  */
 public void permuter() {
  double temp = this.X;
  this.X = this.Y;
  this.Y = temp;
 }

 /**
  * 
  * @param _newX
  * @param _newY
  */
 public void seDeplacer(double _newX, double _newY) {
  this.X += _newX;
  this.Y += _newY;
 }

 /**
  * 
  * @param unPoint
  */
 public Point symAbcisse() {
  Point symAPoint = new Point(this.X, -this.Y);

  return symAPoint;
 }

 /**
  * 
  * @param unPoint
  */
 public Point SymOrdonnees() {
  Point symPointOr = new Point(-this.X, this.Y);
  return symPointOr;
 }

 /**
  * 
  * @param unPoint
  */
 public Point symOrigine() {
  Point symPointOri = new Point(-this.X, -this.Y);
  return symPointOri;
 }

 public String toString() {
  return "Point (" + (int) this.X + ", " + (int) this.Y + ")\n";
 }

 public double calculDistance(Point _autrePoint) {
  double distancecarre = Math.pow(_autrePoint.getX() - this.X, 2) + Math.pow(_autrePoint.getY() - this.Y, 2);
  double distance = Math.sqrt(distancecarre);

  return Math.round(distance);

 }

}
 