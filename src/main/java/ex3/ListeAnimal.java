package ex3;

import java.util.List;

/**
 * Classe qui définit les liste d'animaux
 * 
 * @author Jérémy Payet
 *
 */
public class ListeAnimal {
	private List<Type> types;
	private List<String> noms;
	private List<Comportement> comportements;

	/**
	 * Constructeur
	 * 
	 * @param types         la liste des types
	 * @param noms          la liste des noms
	 * @param comportements la liste des comportements
	 */
	public ListeAnimal(List<Type> types, List<String> noms, List<Comportement> comportements) {
		super();
		this.types = types;
		this.noms = noms;
		this.comportements = comportements;
	}

	/**
	 * Ajoute un animal à la liste
	 * 
	 * @param animal l'animal
	 */
	public void addAnimal(Animal animal) {
		types.add(animal.getType());
		noms.add(animal.getNom());
		comportements.add(animal.getComportement());
	}

	/**
	 * Affiche la liste des animaux
	 */
	public void afficherListeAnimaux() {
		for (String nom : noms) {
			System.out.println(nom);
		}
	}

	/**
	 * Calcule combien d'animaux sont dans une liste
	 * 
	 * @return le nombre d'animaux dans une liste
	 */
	public int compterAnimaux() {
		return noms.size();
	}

	/**
	 * Calcule combien de kilos les animaux mangeront
	 * 
	 * @return la masse de nourriture journalière
	 */
	public double calculerKgsNourritureParJour() {
		return noms.size() * 10;
	}

	/**
	 * Getter for types
	 * 
	 * @return the types
	 */
	public List<Type> getTypes() {
		return types;
	}

	/**
	 * Setter
	 * 
	 * @param types the types to set
	 */
	public void setTypes(List<Type> types) {
		this.types = types;
	}

	/**
	 * Getter for noms
	 * 
	 * @return the noms
	 */
	public List<String> getNoms() {
		return noms;
	}

	/**
	 * Setter
	 * 
	 * @param noms the noms to set
	 */
	public void setNoms(List<String> noms) {
		this.noms = noms;
	}

	/**
	 * Getter for comportements
	 * 
	 * @return the comportements
	 */
	public List<Comportement> getComportements() {
		return comportements;
	}

	/**
	 * Setter
	 * 
	 * @param comportements the comportements to set
	 */
	public void setComportements(List<Comportement> comportements) {
		this.comportements = comportements;
	}

}
