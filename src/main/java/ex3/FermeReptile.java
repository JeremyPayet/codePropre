package ex3;

import java.util.List;

/**
 * Classe qui définit une liste d'animaux vivant dans une ferme d'animaux
 * 
 * @author Jérémy Payet
 *
 */
public class FermeReptile extends ListeAnimaux {
	/**
	 * Constructor
	 * 
	 * @param types         la liste des types
	 * @param noms          la liste des noms
	 * @param comportements la liste des comportements
	 */
	public FermeReptile(List<Type> types, List<String> noms, List<Comportement> comportements) {
		super(types, noms, comportements);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculerKgsNourritureParJour() {
		return this.getNoms().size() * 0.1;
	}
}
