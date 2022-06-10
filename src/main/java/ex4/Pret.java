package ex4;

import java.util.Date;

/**
 * Classe qui d�finit un pr�t
 * 
 * @author Jeremy Payet
 *
 */
public class Pret {

	private Strategy strategy;
	private double capital;
	private double capitalRestantDu;
	private double taux;
	private Date dateDebut;
	private Date dateFin;

	/**
	 * Constructeur par d�faut qui initialise la strat�gie
	 */
	public Pret() {
		super();
		this.strategy = new PretATerme();
	}

	/**
	 * Constructeur avec taux, capital et d�but de pr�t
	 * 
	 * @param capital   le capital total
	 * @param taux      le taux du pr�t
	 * @param dateDebut la date de d�but du pr�t
	 */
	public Pret(double capital, double taux, Date dateDebut) {
		new Pret();
		this.capital = capital;
		this.taux = taux;
		this.dateDebut = dateDebut;
	}

	/**
	 * Constructeur avec la date de fin
	 * 
	 * @param capital   le capital total
	 * @param taux      le taux du pr�t
	 * @param dateDebut la date de d�but du pr�t
	 * @param dateFin   la date de fin du pr�t
	 */
	public Pret(double capital, double taux, Date dateDebut, Date dateFin) {
		new Pret(capital, taux, dateDebut);
		this.dateFin = dateFin;
	}

	/**
	 * Constructeur avec le capital restant du
	 * 
	 * @param capital          le capital total
	 * @param capitalRestantDu le capital restant
	 * @param taux             le taux du pr�t
	 * @param dateDebut        la date de d�but du pr�t
	 * @param dateFin          la date de fin du pr�t
	 */
	public Pret(double capital, double capitalRestantDu, double taux, Date dateDebut, Date dateFin) {
		new Pret(capital, taux, dateDebut, dateFin);
		this.capitalRestantDu = capitalRestantDu;

	}

	/**
	 * Getter for strategy
	 * 
	 * @return the strategy
	 */
	public Strategy getStrategy() {
		return strategy;
	}

	/**
	 * Setter
	 * 
	 * @param strategy the strategy to set
	 */
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * Getter for capital
	 * 
	 * @return the capital
	 */
	public double getCapital() {
		return capital;
	}

	/**
	 * Setter
	 * 
	 * @param capital the capital to set
	 */
	public void setCapital(double capital) {
		this.capital = capital;
	}

	/**
	 * Getter for capitalRestantDu
	 * 
	 * @return the capitalRestantDu
	 */
	public double getCapitalRestantDu() {
		return capitalRestantDu;
	}

	/**
	 * Setter
	 * 
	 * @param capitalRestantDu the capitalRestantDu to set
	 */
	public void setCapitalRestantDu(double capitalRestantDu) {
		this.capitalRestantDu = capitalRestantDu;
	}

	/**
	 * Getter for taux
	 * 
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/**
	 * Setter
	 * 
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	/**
	 * Getter for dateDebut
	 * 
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/**
	 * Setter
	 * 
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * Getter for dateFin
	 * 
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/**
	 * Setter
	 * 
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

}
