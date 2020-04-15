package uvsq.m1.gl;

import java.util.Calendar;

public class Employe {

	private final String nom;
	private final int annee;
	
	public Employe(String nom,int annee) {
		this.nom = nom;
		this.annee=annee;
	

}

	public String getNom() {
		return nom;
	}

	public int getAnnee() {
		return annee;
	}
	public double calculSalaire() {
		Calendar c = Calendar.getInstance();
		int annee_courante = c.get(Calendar.YEAR);
		return 1500+20*(annee_courante-annee);
	}
}
