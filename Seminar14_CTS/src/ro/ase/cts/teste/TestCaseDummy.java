package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;

public class TestCaseDummy {

	private IStudent studentDummy;
	
	@Before
	public void setUp() throws Exception {
		studentDummy = new StudentDummy();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdaugaStudent() {
		Grupa grupa = new Grupa(1000);
		grupa.adaugaStudent(studentDummy);
		assertEquals(1, grupa.getListaStudenti().size());
	}
	
	@Test
	public void testAdaugaStudentCardinality() {
		Grupa grupa = new Grupa(1000);
		IStudent studentDummy1 = new StudentDummy();
		IStudent studentDummy2 = new StudentDummy();
		grupa.adaugaStudent(studentDummy);
		grupa.adaugaStudent(studentDummy1);
		grupa.adaugaStudent(studentDummy2);
		assertEquals(3, grupa.getListaStudenti().size());
	}
}