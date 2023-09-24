package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		Gaulois obelix = new Gaulois("Obelix", 8);
		Gaulois asterix = new Gaulois("Asterix", 8);
		Romain minus = new Romain("Minus", 6);
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par  Bélénos, ce n'est pas juste!");
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);		
	}

}
