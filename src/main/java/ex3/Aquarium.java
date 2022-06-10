package ex3;

import java.util.List;

/**
 * Sous-classe qui définit un aquarium
 * 
 * @author Jérémy Payet
 *
 */
public class Aquarium extends ListeAnimal {
	/**
	 * Constructeur
	 * 
	 * @param types         la liste des types
	 * @param noms          la liste des noms
	 * @param comportements la liste des comportements
	 */
	public Aquarium(List<Type> types, List<String> noms, List<Comportement> comportements) {
		super(types, noms, comportements);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculerKgsNourritureParJour() {
		return this.getNoms().size() * 0.2;
	}
}
