package pokemon;

public class Pokemon {
	
	private String nom;
	private String criVictoire;
	private String criDefaite;
	private int ptVie;
	private int ptVieStart;
	private int puissance;
	private int niveau;
	
	
	
	public Pokemon (String nom, String criVictoire,String criDefaite,int ptVie,int puissance,int niveau) {
		this.setCriDefaite(criDefaite);
		this.setCriVictoire(criVictoire);
		this.setNom(nom);
		this.setPtVie(ptVie);
		this.ptVieStart = ptVie;
		this.setPuissance(puissance);
		this.setniveau(niveau);
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getCriVictoire() {
		return criVictoire;
	}
	
	public void setCriVictoire(String criVictoire) {
		this.criVictoire = criVictoire;
	}
	
	public String getCriDefaite() {
		return criDefaite;
	}
	
	public void setCriDefaite(String criDefaite) {
		this.criDefaite = criDefaite;
	}
	
	public int getPtVie() {
		return ptVie;
	}
	
	public void setPtVie(int ptVie) {
		this.ptVie = ptVie;
	}
	
	public int getPuissance() {
		return puissance;
	}
	
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	
	public int getniveau() {
		return niveau;
	}
	
	public void setniveau(int niveau) {
		this.niveau = niveau;
	}
	
	public void takeDegats(int puissance, int niveau) {
		int diff = this.getniveau() - niveau;
			if(diff >= 0)
				this.setPtVie(this.getPtVie()-(puissance - diff));
			else {
				if((puissance + (-diff) < 0)){
					this.setPtVie(this.getPtVie()-1);
			} else
				this.setPtVie(this.getPtVie()-(puissance + (-diff)));
				
			} 
	}

	public int getPtVieStart() {
		return ptVieStart;
	}
	
	public String toString() {
		return this.getNom() + " est lvl "+this.getniveau() + ", il a " + this.getPtVie() + " de vie et sa puissance d'attaque est " + this.getPuissance();
	}

}
