package pokemon;

public class GeneratorPokemon extends Pokemon {

	public GeneratorPokemon(String criVictoire, String criDefaite) {
		super(generateNom(), criVictoire, criDefaite, generatePtVie(), generatePuissance(),generateNiveau());
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
	
	public static int generateNiveau() {
		int niveau = (int)(Math.random() * 100) + 1;
		return niveau;
	}
	

}
