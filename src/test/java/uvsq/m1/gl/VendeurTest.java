package uvsq.m1.gl;

import static org.junit.Assert.*;

import org.junit.Test;

public class VendeurTest {

	@Test
	public void CalculSalaireVendeurTest() {
		Vendeur Vdr= new Vendeur("Maryeme",2017);
		Vdr.setCommission(20.5);
		assert (Vdr.calculSalaire()==1600.5);
	}
}
