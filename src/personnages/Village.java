package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	private Gaulois[] villageois;
	
	
	public Village(String nom, Chef chef, int nbVillageoisMaximum) {
		this.nom = nom;
		this.chef = chef;
		villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois ++;
	}
	
	public void trouverHabitant(int rang) {
		System.out.println(villageois[rang]);
	}
	 
	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + chef + " vivent les légendaires gaulois :");
		for (int i=0; i<nbVillageois; ++i){
		    System.out.println("	-  " + villageois[i].getNom());
		}
	}
}
