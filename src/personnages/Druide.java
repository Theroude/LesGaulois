package personnages;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;

	public Druide(String nom, int effertPotionMin, int effertPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effertPotionMin;
		this.effetPotionMax = effertPotionMax;
		parler("Bonjour, je suis le druide" + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à " + effetPotionMax + " . ");
		
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + " >>");

	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

}
