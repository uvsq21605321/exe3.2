package uvsq.m1.gl;

public class Vendeur extends Employe{

private double commission;
	
	public Vendeur(String nom, int annee) {
		super(nom, annee);
		this.commission=0;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}
	@Override
	public double calculSalaire() {
		return super.calculSalaire()+commission;
	}
}
