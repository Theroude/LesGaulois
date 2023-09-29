package histoire;

import personnages.*;

public class Scenario {

	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		Gaulois obelix = new Gaulois("Obelix", 25);
		Gaulois asterix = new Gaulois("Asterix", 8);
		Romain minus = new Romain("Minus", 6);
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par  Bélénos, ce n'est pas juste!");
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);		
		
		Chef abraracourcix = new Chef("Abraracourcix", 6);
		Village villageDesIrreductibles = new Village("village des irreductibles", abraracourcix, 30);
//		Gaulois gaulois = villageDesIrreductibles.trouverHabitant(30);
//		Type mismatch: cannot convert from void to Gaulois
		villageDesIrreductibles.setChef(abraracourcix);
		villageDesIrreductibles.ajouterHabitant(asterix);
		villageDesIrreductibles.ajouterHabitant(obelix);
//		Gaulois gaulois = villageDesIrreductibles.trouverHabitant(1);
//		Type mismatch: cannot convert from void to Gaulois
		villageDesIrreductibles.afficherVillageois();
		
		
	}

}
