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
	
	@Test
	public void testCalculateMedieNota() {
		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(nota, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testCalculateMedieNote() {
		Student student = new Student();
		int nota1 = 8;
		int nota2 = 8;
		int nota3 = 7;
		
		float medie = (nota1+nota2+nota3)/3.0f;
		
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		assertEquals(medie, student.calculeazaMedie(), 0.01);
		
	}
	
	@Test
	public void testCalculateMedieEmpty() {
		Student student = new Student();
		assertEquals(0, student.calculeazaMedie(),0.01);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testGetNota() {
		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(-1));
	}
	
	@Test
	public void testCalculateMedieJU3() {
		Student student = new Student();
		int nota = 8;
		try {
			int x = student.getNota(-1);
			fail("Test Case JU3 failed");
		}catch(IndexOutOfBoundsException err) {
			
		}
	}
	
	@Test
	public void testVerificaRestanteTrue() {
		Student student = new Student();
		student.adaugaNota(8);
		student.adaugaNota(6);
		student.adaugaNota(7);
		
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testVerificaRestanteFalse() {
		Student student = new Student();
		student.adaugaNota(8);
		student.adaugaNota(4);
		student.adaugaNota(7);
		
		assertFalse(student.areRestante());
	}

}
