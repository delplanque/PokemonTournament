package pokemon;

public class GeneratorPokemon extends Pokemon {

	public GeneratorPokemon(String criVictoire, String criDefaite) {
		super(generateNom(), criVictoire, criDefaite, generatePtVie(), generatePuissance(),generateDefense(),generateVitesse());
	}
	
	public static String generateNom() {
		return ListPokemon.randomPokemon().getNom();	
	}
	
	public static int generatePtVie() {
		int vie = (int)(Math.random() * 100) + 1;
		return vie;
	}
	
	public static int generatePuissance() {
		int force = (int)(Math.random() * 30) +1;
		return force;
	}
	
	public static int generateDefense() {
		int defense = (int)(Math.random() * 30) + 1;
		return defense;
	}
	
	public static int generateVitesse() {
		int vitesse = (int)(Math.random() * 30) + 1;
		return vitesse;
	}
	

}
