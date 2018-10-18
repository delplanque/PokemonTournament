package pokemon;

import java.util.*;

public enum ListPokemon {
	
	pikachu ("pikachu"),
	salameche ("salameche"),
	bulbizarre ("bulbizarre"),
	raichu ("raichu"),
	evoli ("evoli"),
	abo ("abo"),
	dracofeu ("dracofeu"),
	smogo ("smogo"),
	electek ("electek"),
	voltorbe ("voltorbe"),
	arcanin ("arcanin"),
	machoc ("machoc"),
	voltali ("voltali"),
	carapuce ("carapuce");
	
	
	private String nom;
	
	private ListPokemon(String nom) {
		this.setNom(nom);
	} 
	
	private static final List<ListPokemon> VALUES =
		    Collections.unmodifiableList(Arrays.asList(values()));
		  private static final int SIZE = VALUES.size();
		  private static final Random RANDOM = new Random();

		  public static ListPokemon randomPokemon()  {
		    return VALUES.get(RANDOM.nextInt(SIZE));
		  }

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

}
