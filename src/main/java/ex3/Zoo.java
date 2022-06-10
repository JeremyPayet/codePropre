package ex3;

import java.util.ArrayList;

/**
 * Classe qui repr�sente un Zoo sous forme de listes d'animaux pour un nom donn�
 * 
 * @author J�r�my Payet
 *
 */
public class Zoo {

	private String nom;
	private SavaneAfricaine savaneAfricaine;
	private ZoneCarnivore zoneCarnivore;
	private FermeReptile fermeReptile;
	private Aquarium aquarium;

	/**
	 * Constructor avec juste le nom
	 * 
	 * @param nom le nom du zoo
	 */
	public Zoo(String nom) {
		this(nom, new SavaneAfricaine(new ArrayList<>(), new ArrayList<>(), new ArrayList<>()),
				new ZoneCarnivore(new ArrayList<>(), new ArrayList<>(), new ArrayList<>()),
				new FermeReptile(new ArrayList<>(), new ArrayList<>(), new ArrayList<>()),
				new Aquarium(new ArrayList<>(), new ArrayList<>(), new ArrayList<>()));
	}

	/**
	 * Constructor par d�faut
	 * 
	 * @param nom             le nom du zoo
	 * @param savaneAfricaine la liste des animaux dans la savane africaine
	 * @param zoneCarnivore   la liste des animaux de la zone carnivore
	 * @param fermeReptile    la liste des animaux dans la ferme aux reptiles
	 * @param aquarium        la iste des animaux dans un aquarium
	 */
	public Zoo(String nom, SavaneAfricaine savaneAfricaine, ZoneCarnivore zoneCarnivore, FermeReptile fermeReptile,
			Aquarium aquarium) {
		super();
		this.nom = nom;
		this.savaneAfricaine = savaneAfricaine;
		this.zoneCarnivore = zoneCarnivore;
		this.fermeReptile = fermeReptile;
		this.aquarium = aquarium;
	}

	/**
	 * Ajoute un animal � la liste correspondant � son type et son comportement
	 * 
	 * @param nomAnimal    le nom de l'animal
	 * @param typeAnimal   le type de l'animal
	 * @param comportement le r�gime alimentaire de l'animal
	 */
	public void addAnimal(String nomAnimal, Type typeAnimal, Comportement comportement) {
		if (typeAnimal.equals("MAMMIFERE")) {
			switch (comportement) {
			case HERBIVORE:
				this.savaneAfricaine.addAnimal(typeAnimal, nomAnimal, comportement);
				break;
			default:
				this.zoneCarnivore.addAnimal(typeAnimal, nomAnimal, comportement);
				break;
			}
		} else if (typeAnimal.equals("REPTILE")) {
			this.fermeReptile.addAnimal(typeAnimal, nomAnimal, comportement);
		} else if (typeAnimal.equals("POISSON")) {
			this.aquarium.addAnimal(typeAnimal, nomAnimal, comportement);
		}
	}

	/**
	 * Affiche tout les animaux du zoo
	 */
	public void afficherListeAnimaux() {
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
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
}
