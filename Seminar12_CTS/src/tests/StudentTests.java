package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase.Student;

public class StudentTests {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConstructorRightName() {
		String nume="Ion";
		Student student = new Student(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testListAddNotaCorect() {
		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testListSize() {
		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}

}
