package ex2;

/**
*  Représente un livret A
* 
* @author Jérémy Payet 
*/
/**
 * Corrigé par Jérémy Payet
 */
public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/**
	 * @param solde            la solde
	 * @param decouvert        le découvert
	 * @param type             le type
	 * @param tauxRemuneration le taux de rémunération
	 */
	public LivretA(TypeCompte type, double solde, double decouvert, double tauxRemuneration) {
		super(TypeCompte.LA, solde, decouvert);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Applique le taux de rémunération à la solde
	 */
	public void appliquerRemuAnnuelle() {
		this.setSolde(this.getSolde() + this.getSolde() * tauxRemuneration / 100);
	}

	/**
	 * Retire un montant à la solde
	 * 
	 * @param montant le montant
	 */
	@Override
	public void debiterMontant(double montant) {
		if (this.getSolde() - montant > 0) {
			this.setSolde(this.getSolde() - montant);
		}
	}

	/**
	 * Getter for tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
