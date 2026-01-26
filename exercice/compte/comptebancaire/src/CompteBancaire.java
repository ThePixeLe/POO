

/**
 * @author LSoilihi
 * @version 1.0
 * @created 26-janv.-2026 14:48:22
 */
public class CompteBancaire {

	private int numero;
	private String nomProprietaire;
	private double solde;
	private double decouvertAutoriser;



	

	public final void CompteBancaire(){

	}

	/**
	 * 
	 * @param _num
	 * @param _nomProprio
	 * @param _solde
	 * @param _decouvertAutorise
	 */
	public final void CompteBancaire(int _num, String _nomProprio, double _solde, double _decouvertAutorise){

	}

	public String getnomProprietaire(){
		return nomProprietaire;
	}

	public String getnumero(){
		return numero;
	}

	public double getsolde(){
		return solde;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setsolde(double newVal){
		solde = newVal;
	}

	public double getdecouvertAutoriser(){
		return decouvertAutoriser;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setdecouvertAutoriser(double newVal){
		decouvertAutoriser = newVal;
	}

	/**
	 * 
	 * @param _double montant
	 */
	public void crediter(double _double montant){

	}

	/**
	 * 
	 * @param _doublemontant
	 */
	public boolean debiter(double _doublemontant){
		return false;
	}

	/**
	 * 
	 * @param montant
	 * @param autreCompte
	 */
	public boolean transfert(double montant, CompteBancaire autreCompte){
		return false;
	}

	/**
	 * 
	 * @param autreCompte
	 * @param comparer
	 */
	public boolean superieur(CompteBancaire autreCompte, boolean comparer){
		return false;
	}

	public String toString(){
		return "";
	}

}