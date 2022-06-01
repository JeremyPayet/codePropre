package ex2;

/**
 * Repr�sente un compte bancaire de type compte courante (type=CC) ou livret A
 * (type=LA)
 * 
 * @author DIGINAMIC 
 */
/**
 * Corrig� par J�r�my Payet
 */

public class CompteBancaire {

	/** solde : solde du compte */
	private double solde;

	/**
	 * decouvert : un d�couvert est autoris� seulement pour les comptes courants
	 */
	private double decouvert;

	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */

	private TypeCompte type;

	/**
	 * @param solde     la solde
	 * @param decouvert le d�couvert
	 * @param type      le type
	 */
	public CompteBancaire(TypeCompte type, double solde, double decouvert) {
		super();
		this.type = type;
		this.solde = solde;
		this.decouvert = decouvert;
	}

	/**
	 * Ajoute un montant � la solde
	 * 
	 * @param montant le montant
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * Retire un montant � la solde
	 * 
	 * @param montant le montant
	 */
	public void debiterMontant(double montant) {
		if (this.solde - montant > decouvert) {
			this.solde = solde - montant;
		}
	}

	/**
	 * Getter for solde
	 * 
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter
	 * 
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Getter for decouvert
	 * 
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * Setter
	 * 
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	/**
	 * Getter for type
	 * 
	 * @return the type
	 */
	public TypeCompte getType() {
		return type;
	}

	/**
	 * Setter
	 * 
	 * @param type the type to set
	 */
	public void setType(TypeCompte type) {
		this.type = type;
	}
}
