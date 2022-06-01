package ex1;

import java.util.Date;

/**
 * Classe qui définit une entreprise
 * 
 * @author Jérémy Payet
 */
public class Entreprise {

	private int siret;
	private String nom;
	private String adresse;
	private Date dateCreation;

	/**
	 * Le capital max
	 */
	public static final int CAPITAL_MAX = 3000000;

	/**
	 * Affiche le statut de l'entreprise
	 */
	public void Afficher_statut() {

	}

	/**
	 * Getter for siret
	 * 
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * Setter
	 * 
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter for adresse
	 * 
	 * @return the adress
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Setter
	 * 
	 * @param adresse the address to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Getter for dateCreation
	 * 
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * Setter
	 * 
	 * @param dateCreation the date of creation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

}
