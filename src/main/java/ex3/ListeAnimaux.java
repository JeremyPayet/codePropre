/**
 * 
 */
package ex3;

import java.util.List;

/**
 * Classe qui convertit un Animal en liste d'animaux
 * 
 * @author J�r�my Payet
 *
 */
public class ListeAnimaux {

	/** types : la liste des diff�rents animaux */
	private List<Type> types;
	/**
	 * noms : la liste des diff�rents groupes d'animaux (mammif�re, poisson, ...)
	 */
	private List<String> noms;
	/**
	 * comportements : la liste des diff�rents comportements (carnivore, herbivore,
	 * omnivore)
	 */
	private List<Comportement> comportements;

	/**
	 * Constructor
	 * 
	 * @param types         la liste des types
	 * @param noms          la liste des noms
	 * @param comportements la liste des comportements
	 */
	public ListeAnimaux(List<Type> types, List<String> noms, List<Comportement> comportements) {
		super();
		this.types = types;
		this.noms = noms;
		this.comportements = comportements;
	}

	/**
	 * Ajoute un animal � la liste
	 * 
	 * @param typeAnimal   le type de l'animal
	 * @param nomAnimal    le nom de l'animal
	 * @param comportement le r�gine alimentaire de l'animal
	 */
	public void addAnimal(Type typeAnimal, String nomAnimal, Comportement comportement) {
		types.add(typeAnimal);
		noms.add(nomAnimal);
		comportements.add(comportement);
	}

	/**
	 * Affiche le nom de chaque animal dans une liste
	 */
	public void afficherListeAnimaux() {
		for (String nom : noms) {
			System.out.println(nom);
		}
	}

	/**
	 * Retourne le nombre d'animaux
	 * 
	 * @return le nombre d'animaux
	 */
	public int compterAnimaux() {
		return noms.size();
	}

	/**
	 * Retourne la masse de nourriture journali�re
	 * 
	 * @return la masse de nourriture
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
	 * Getter for comportement
	 * 
	 * @return the comportement
	 */
	public List<Comportement> getComportements() {
		return comportements;
	}

	/**
	 * Setter
	 * 
	 * @param comportements the comportement to set
	 */
	public void setComportements(List<Comportement> comportements) {
		this.comportements = comportements;
	}

}
