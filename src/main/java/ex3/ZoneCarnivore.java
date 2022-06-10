package ex3;

import java.util.List;

/**
 * Sous-classe qui d�finit une zone de carnivore
 * 
 * @author J�r�my Payet
 *
 */
public class ZoneCarnivore extends ListeAnimal {
	/**
	 * Constructeur
	 * 
	 * @param types         la liste des types
	 * @param noms          la liste des noms
	 * @param comportements la liste des comportements
	 */
	public ZoneCarnivore(List<Type> types, List<String> noms, List<Comportement> comportements) {
		super(types, noms, comportements);
		// TODO Auto-generated constructor stub
	}
}
