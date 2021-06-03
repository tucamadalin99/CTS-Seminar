package ro.ase.cts.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ro.ase.cts.categorii.TesteGetPromovabilitate;
import ro.ase.cts.categorii.TesteNormale;
import ro.ase.cts.categorii.TesteUrgente;
import ro.ase.cts.clase.Grupa;

public class TestGrupaCuFake {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@Category({TesteUrgente.class, TesteGetPromovabilitate.class})
	void testPromovabilitateFaraRestante() {
		FakeStudent studentFake = new FakeStudent();
		studentFake.setAreRestanta(false);
		
		Grupa grupa = new Grupa(1004);
		grupa.adaugaStudent(studentFake);
		
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}
	
	@Test
	@Category({TesteNormale.class, TesteGetPromovabilitate.class})
	void testPromovabilitateCuRestante() {
		FakeStudent studentFake = new FakeStudent();
		studentFake.setAreRestanta(true);
		
		Grupa grupa = new Grupa(1004);
		grupa.adaugaStudent(studentFake);
		
		assertEquals(0, grupa.getPromovabilitate(), 0.01);
	}

}