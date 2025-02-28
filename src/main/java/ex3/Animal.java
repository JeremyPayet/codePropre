package ex3;

/**
 * Classe qui d�finit un animal
 * 
 * @author J�r�my Payet
 *
 */
public class Animal {
	private Type type;
	private String nom;
	private Comportement comportement;

	/**
	 * Constructeur
	 * 
	 * @param type         le type de l'animal
	 * @param nom          le nom de l'animal
	 * @param comportement le r�gime alimentaire de l'animal
	 */
	public Animal(Type type, String nom, Comportement comportement) {
		super();
		this.type = type;
		this.nom = nom;
		this.comportement = comportement;
	}

	/**
	 * Getter for type
	 * 
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * Setter
	 * 
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
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

	/**
	 * Getter for comportement
	 * 
	 * @return the comportement
	 */
	public Comportement getComportement() {
		return comportement;
	}

	/**
	 * Setter
	 * 
	 * @param comportement the comportement to set
	 */
	public void setComportement(Comportement comportement) {
		this.comportement = comportement;
	}

}
