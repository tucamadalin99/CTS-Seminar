package ro.ase.cts.teste;

import java.util.List;

import ro.ase.cts.clase.IStudent;

public class StudentStub implements IStudent{

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return null;
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
		return 9;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return 9;
	}

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return false;
	}

	
}