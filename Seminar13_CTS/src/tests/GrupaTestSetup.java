package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.Student;

public class GrupaTestSetup {
	Grupa grupa;

	@Before
	public void setUp() throws Exception {
		grupa = new Grupa(1010);
		for(int i=1;i<36;i++) {
			Student student = new Student();
			student.adaugaNota(i%10 + 1);
			grupa.adaugaStudent(student);
		}
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(timeout=100)
	public void performancePromovabilitateTest() {
		grupa.getPromovabilitate();
	}

}