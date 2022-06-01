package ex1;

import java.util.Date;

/**
 * Classe qui définit une entreprise*
 * 
 * @author Jérémy Payet
 */
public class Entreprise {

	private int siret;
	private String nom;
	private String adresse;
	private Date dateCreation;

	public static final int CAPITAL_MAX = 3000000;

	public void Afficher_statut() {

	}

	public int getSiret() {
		return siret;
	}

	public void setSiret(int siret) {
		this.siret = siret;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

}
