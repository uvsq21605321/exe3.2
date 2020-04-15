package uvsq.m1.gl;

public class Manager extends Employe{

	private int nb;
	
	public Manager(String nom, int annee) {
		super(nom, annee);
		nb=1;
	}
	public int getNb() {
		return nb;
	}
	public void setNbr(int nb) {
		this.nb = nb;
	}
	@Override
	public double calculSalaire() {
		return super.calculSalaire()+100*nb;
	}
}
