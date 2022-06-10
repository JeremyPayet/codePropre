package ex3;

/**
 * Classe qui définit un animal
 * 
 * @author Jérémy Payet
 *
 */
public class Animal {
	/** types : la type de l'animal */
	private String type;
	/**
	 * noms : le groupe de l'animal (mammifère, poisson, ...)
	 */
	private String nom;
	/**
	 * comportement : le comportement de l'animal (carnivore, herbivore, omnivore)
	 * Autant le passer en énumération si on n'a que 3 comportements
	 */
	private Comportement comportement;
}
