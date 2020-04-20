package uvsq.m1.gl;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeTest {
	
	@Test
	public void CalculSalaireEmployeTest() {
		Employe Emp= new Employe("Maryeme",2016);
		assert (Emp.calculSalaire()==1580);
	}
	
}
