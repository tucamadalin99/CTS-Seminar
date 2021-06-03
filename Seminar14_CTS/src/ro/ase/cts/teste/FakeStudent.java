package ro.ase.cts.teste;

import java.util.List;

import ro.ase.cts.clase.IStudent;

public class FakeStudent implements IStudent{

	private String nume;
	private float medie;
	private boolean areRestanta;
	
	public FakeStudent() {
		
	}
	
	public FakeStudent(String nume, float medie, boolean areRestanta) {
		super();
		this.nume = nume;
		this.medie = medie;
		this.areRestanta = areRestanta;
	}

	public float getMedie() {
		return medie;
	}

	public void setMedie(float medie) {
		this.medie = medie;
	}

	public boolean isAreRestanta() {
		return areRestanta;
	}

	public void setAreRestanta(boolean areRestanta) {
		this.areRestanta = areRestanta;
	}

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return nume;
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		// TODO Auto-generated method stub
		return medie;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return areRestanta;
	}

}