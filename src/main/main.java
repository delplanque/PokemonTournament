package main;
import pokemon.*;
import tournament.Tournament;

public class main {

	public static void main(String[] args) {
		Tournament tournoi = new Tournament(2);
		int tour = 1;		
		System.out.println("Pokemons dans le tournoi : ");
		for(Pokemon p: tournoi.getlPokemons()) {
			System.out.println(p.toString());			
		}
		
		while(tournoi.getlPokemons().size() > 1 ) {
			System.out.println("\nTour : " + tour);
			tournoi.combat();
			
			tour++;
		}
		
		Pokemon pokemonGagnant = tournoi.getlPokemons().get(0);
		System.out.println("\nVainqueur du tournoi " + pokemonGagnant.getNom());

	}

}
