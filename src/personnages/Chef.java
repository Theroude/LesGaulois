package personnages;
import personnages.Village;

public class Chef {
	private String nom;
	private int force;
	private int effetPotion = 1;
//	private Village village;
	

	public Chef(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + " >>");

	}

	private String prendreParole() {
		return "Le chef " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(force/3);
		
	}

	public void boirePotion(int effetPotion) {
		this.effetPotion = effetPotion;
		parler("Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée");
	}
	
	public String toString() {
		return nom;
	}
}
