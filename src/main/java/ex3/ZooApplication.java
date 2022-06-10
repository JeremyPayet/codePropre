package ex3;

/**
 * Classe qui lance l'application avec Zoo
 * 
 * @author Jérémy Payet
 *
 */
public class ZooApplication {
	/**
	 * Fonction main
	 * 
	 * @param args les arguments d'entrée
	 */
	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");

		zoo.addAnimal("Gazelle", Type.MAMMIFERE, Comportement.HERBIVORE);
		zoo.addAnimal("Zèbre", Type.MAMMIFERE, Comportement.HERBIVORE);
		zoo.addAnimal("Lion", Type.MAMMIFERE, Comportement.HERBIVORE);
		zoo.addAnimal("Panthère", Type.MAMMIFERE, Comportement.CARNIVORE);
		zoo.addAnimal("Requin blanc", Type.POISSON, Comportement.HERBIVORE);
		zoo.addAnimal("Truite dorée", Type.POISSON, Comportement.HERBIVORE);
		zoo.addAnimal("Boa constrictor", Type.REPTILE, Comportement.CARNIVORE);
		zoo.addAnimal("Python", Type.REPTILE, Comportement.CARNIVORE);

		zoo.afficherListeAnimaux();
	}

}
