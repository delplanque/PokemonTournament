package tournament;

import java.util.ArrayList;
import java.util.ListIterator;

import pokemon.GeneratorPokemon;
import pokemon.Pokemon;

public class Tournament {
	
	private int nbPokemons;
	private ArrayList<Pokemon> lPokemons;
	
	public Tournament(int nbPokemons) {
		this.setNbPokemons(nbPokemons);	
		this.lPokemons = new ArrayList<>();
		for(int i = 0; i < this.getNbPokemons(); i++) {
			this.lPokemons.add(new GeneratorPokemon("Rooar", "zzzz"));
		}
	}
	
	public ArrayList<Pokemon[]> creationManche() {
		ArrayList<Pokemon[]> manche = new ArrayList<>();
		ListIterator<Pokemon> litr = this.getlPokemons().listIterator();
		while (litr.hasNext()) {
			Pokemon adversaire1 = litr.next();
			Pokemon adversaire2 = null;
			if(litr.hasNext()) {
				adversaire2 = litr.next();  
			}
			Pokemon[] adversaires = {adversaire1,adversaire2};
			manche.add(adversaires);  

		}
		return manche;
	}
	
	public void combat() {
		
		ArrayList<Pokemon[]> manche = creationManche();
		for(Pokemon[] p: manche) {
			System.out.println("\n");
			if(p[0] != null && p[1] != null) {
				Pokemon adv1= null;
				Pokemon adv2= null;
				if(p[0].getVitesse() > p[1].getVitesse()) {
					adv1 = p[0];
					adv2 = p[1];
				}else {
						adv1 = p[1];
						adv2 = p[0];
				}

				while(adv1.getPtVie() > 0 && adv2.getPtVie() > 0 ) {
					adv2.takeDegats(adv1.getPuissance());				
					if(adv2.getPtVie() > 0) {
						adv1.takeDegats(adv2.getPuissance());
					}
						
					if(adv1.getPtVie() <= 0) {
						finMatch(adv2,adv1);
					}
					if(adv2.getPtVie() <= 0) {
						finMatch(adv1,adv2);
					}
				}
			}
		}
	}

	private void finMatch(Pokemon vainqueur,Pokemon perdant) {
		this.getlPokemons().remove(perdant);
		System.out.println(perdant.getNom() + " cri : "+ perdant.getCriDefaite());
		System.out.println(vainqueur.getNom() + " cri : "+ vainqueur.getCriVictoire());
		System.out.println("\nVainqueur : " + vainqueur.toString() + "\nPerdant :  "  +perdant.toString());
		vainqueur.setPtVie(vainqueur.getPtVieStart());
	}

	public int getNbPokemons() {
		return nbPokemons;
	}

	public void setNbPokemons(int nbPokemons) {
		this.nbPokemons = nbPokemons;
	}

	public ArrayList<Pokemon> getlPokemons() {
		return lPokemons;
	}
}
