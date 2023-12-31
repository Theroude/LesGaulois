package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;

	public Druide(String nom, int effertPotionMin, int effertPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effertPotionMin;
		this.effetPotionMax = effertPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + " . ");

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

	public int preparerPotion() {
		Random random = new Random();
		forcePotion = random.nextInt(effetPotionMax - effetPotionMin) + effetPotionMin;
		if (forcePotion > 7) {
			parler("J'ai préparé une super potion de force " + forcePotion);
		} else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + forcePotion);
		}
		return forcePotion;
	}

	public void booster(Gaulois gaulois) {
		if (gaulois.getNom().equals("Obelix")) {
			parler("Non, Obélix !... Tu n’auras pas de potion magique !");
		} else {
			gaulois.boirePotion(forcePotion);
		}
	}
}
