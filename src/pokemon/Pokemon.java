package pokemon;

public class Pokemon {
	
	private String nom;
	private String criVictoire;
	private String criDefaite;
	private int ptVie;
	private int ptVieStart;
	private int puissance;
	private int defense;
	private int vitesse;
	
	
	
	public Pokemon (String nom, String criVictoire,String criDefaite,int ptVie,int puissance,int defense,int vitesse) {
		this.setCriDefaite(criDefaite);
		this.setCriVictoire(criVictoire);
		this.setNom(nom);
		this.setPtVie(ptVie);
		this.ptVieStart = ptVie;
		this.setPuissance(puissance);
		this.setDefense(defense);
		this.setVitesse(vitesse);
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
	
	public int getDefense() {
		return defense;
	}
	
	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	public void takeDegats(int puissance) {
		int dommage;
		if(defense > puissance) {
			dommage = 1;
		}
		else {
			dommage = puissance - defense;
		}
			this.setPtVie(this.getPtVie()-dommage);
	}

	public int getPtVieStart() {
		return ptVieStart;
	}
	
	public String toString() {
		return this.getNom() +" a " + this.getPtVie() + " de vie , sa puissance d'attaque est " + this.getPuissance()
		+ " , sa defense est de " +this.getDefense() + " et il a une vitesse de " + this.getVitesse();
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

}
