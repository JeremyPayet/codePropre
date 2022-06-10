package ex3;

/**
 * Classe qui d�finit un animal
 * 
 * @author J�r�my Payet
 *
 */
public class Animal {
	/** types : la type de l'animal */
	private String type;
	/**
	 * noms : le groupe de l'animal (mammif�re, poisson, ...)
	 */
	private String nom;
	/**
	 * comportement : le comportement de l'animal (carnivore, herbivore, omnivore)
	 * Autant le passer en �num�ration si on n'a que 3 comportements
	 */
	private Comportement comportement;
}
